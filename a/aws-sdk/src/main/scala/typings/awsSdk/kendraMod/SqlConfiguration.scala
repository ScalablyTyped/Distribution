package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlConfiguration extends js.Object {
  /**
    * Determines whether Amazon Kendra encloses SQL identifiers in double quotes (") when making a database query. By default, Amazon Kendra passes SQL identifiers the way that they are entered into the data source configuration. It does not change the case of identifiers or enclose them in quotes. PostgreSQL internally converts uppercase characters to lower case characters in identifiers unless they are quoted. Choosing this option encloses identifiers in quotes so that PostgreSQL does not convert the character's case. For MySQL databases, you must enable the ansi_quotes option when you choose this option.
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
  implicit class SqlConfigurationOps[Self <: SqlConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQueryIdentifiersEnclosingOption(value: QueryIdentifiersEnclosingOption): Self = this.set("QueryIdentifiersEnclosingOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryIdentifiersEnclosingOption: Self = this.set("QueryIdentifiersEnclosingOption", js.undefined)
  }
  
}

