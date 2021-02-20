package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGlobalTableOutput extends StObject {
  
  /**
    * Contains the details of the global table.
    */
  var GlobalTableDescription: js.UndefOr[typings.awsSdk.dynamodbMod.GlobalTableDescription] = js.native
}
object CreateGlobalTableOutput {
  
  @scala.inline
  def apply(): CreateGlobalTableOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGlobalTableOutput]
  }
  
  @scala.inline
  implicit class CreateGlobalTableOutputMutableBuilder[Self <: CreateGlobalTableOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalTableDescription(value: GlobalTableDescription): Self = StObject.set(x, "GlobalTableDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalTableDescriptionUndefined: Self = StObject.set(x, "GlobalTableDescription", js.undefined)
  }
}
