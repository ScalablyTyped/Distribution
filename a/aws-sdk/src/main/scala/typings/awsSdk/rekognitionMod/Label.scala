package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  /**
    * Level of confidence.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * If Label represents an object, Instances contains the bounding boxes for each instance of the detected object. Bounding boxes are returned for common object labels such as people, cars, furniture, apparel or pets.
    */
  var Instances: js.UndefOr[typings.awsSdk.rekognitionMod.Instances] = js.undefined
  
  /**
    * The name (label) of the object or scene.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The parent labels for a label. The response includes all ancestor labels.
    */
  var Parents: js.UndefOr[typings.awsSdk.rekognitionMod.Parents] = js.undefined
}
object Label {
  
  inline def apply(): Label = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setInstances(value: Instances): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setParents(value: Parents): Self = StObject.set(x, "Parents", value.asInstanceOf[js.Any])
    
    inline def setParentsUndefined: Self = StObject.set(x, "Parents", js.undefined)
    
    inline def setParentsVarargs(value: Parent*): Self = StObject.set(x, "Parents", js.Array(value :_*))
  }
}
