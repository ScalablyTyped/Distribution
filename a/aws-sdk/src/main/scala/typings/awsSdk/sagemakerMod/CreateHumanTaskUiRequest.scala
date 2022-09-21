package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHumanTaskUiRequest extends StObject {
  
  /**
    * The name of the user interface you are creating.
    */
  var HumanTaskUiName: typings.awsSdk.sagemakerMod.HumanTaskUiName
  
  /**
    * An array of key-value pairs that contain metadata to help you categorize and organize a human review workflow user interface. Each tag consists of a key and a value, both of which you define.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  var UiTemplate: typings.awsSdk.sagemakerMod.UiTemplate
}
object CreateHumanTaskUiRequest {
  
  inline def apply(HumanTaskUiName: HumanTaskUiName, UiTemplate: UiTemplate): CreateHumanTaskUiRequest = {
    val __obj = js.Dynamic.literal(HumanTaskUiName = HumanTaskUiName.asInstanceOf[js.Any], UiTemplate = UiTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHumanTaskUiRequest]
  }
  
  extension [Self <: CreateHumanTaskUiRequest](x: Self) {
    
    inline def setHumanTaskUiName(value: HumanTaskUiName): Self = StObject.set(x, "HumanTaskUiName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUiTemplate(value: UiTemplate): Self = StObject.set(x, "UiTemplate", value.asInstanceOf[js.Any])
  }
}
