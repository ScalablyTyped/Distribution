package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TwitterParameters extends StObject {
  
  /**
    * Maximum number of rows to query Twitter.
    */
  var MaxRows: PositiveInteger = js.native
  
  /**
    * Twitter query string.
    */
  var Query: typings.awsSdk.quicksightMod.Query = js.native
}
object TwitterParameters {
  
  @scala.inline
  def apply(MaxRows: PositiveInteger, Query: Query): TwitterParameters = {
    val __obj = js.Dynamic.literal(MaxRows = MaxRows.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterParameters]
  }
  
  @scala.inline
  implicit class TwitterParametersMutableBuilder[Self <: TwitterParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxRows(value: PositiveInteger): Self = StObject.set(x, "MaxRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: Query): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
  }
}
