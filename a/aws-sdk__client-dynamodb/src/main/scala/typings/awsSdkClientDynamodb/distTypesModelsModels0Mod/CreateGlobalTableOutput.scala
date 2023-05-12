package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGlobalTableOutput extends StObject {
  
  /**
    * <p>Contains the details of the global table.</p>
    */
  var GlobalTableDescription: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.GlobalTableDescription] = js.undefined
}
object CreateGlobalTableOutput {
  
  inline def apply(): CreateGlobalTableOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGlobalTableOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGlobalTableOutput] (val x: Self) extends AnyVal {
    
    inline def setGlobalTableDescription(value: GlobalTableDescription): Self = StObject.set(x, "GlobalTableDescription", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableDescriptionUndefined: Self = StObject.set(x, "GlobalTableDescription", js.undefined)
  }
}
