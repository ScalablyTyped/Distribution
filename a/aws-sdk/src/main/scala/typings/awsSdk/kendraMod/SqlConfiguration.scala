package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlConfiguration extends StObject {
  
  /**
    * Determines whether Amazon Kendra encloses SQL identifiers for tables and column names in double quotes (") when making a database query. By default, Amazon Kendra passes SQL identifiers the way that they are entered into the data source configuration. It does not change the case of identifiers or enclose them in quotes. PostgreSQL internally converts uppercase characters to lower case characters in identifiers unless they are quoted. Choosing this option encloses identifiers in quotes so that PostgreSQL does not convert the character's case. For MySQL databases, you must enable the ansi_quotes option when you set this field to DOUBLE_QUOTES.
    */
  var QueryIdentifiersEnclosingOption: js.UndefOr[typings.awsSdk.kendraMod.QueryIdentifiersEnclosingOption] = js.native
}
object SqlConfiguration {
  
  @scala.inline
  def apply(): SqlConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlConfiguration]
  }
  
  @scala.inline
  implicit class SqlConfigurationMutableBuilder[Self <: SqlConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryIdentifiersEnclosingOption(value: QueryIdentifiersEnclosingOption): Self = StObject.set(x, "QueryIdentifiersEnclosingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryIdentifiersEnclosingOptionUndefined: Self = StObject.set(x, "QueryIdentifiersEnclosingOption", js.undefined)
  }
}
