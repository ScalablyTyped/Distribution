package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformParameters extends StObject {
  
  /**
    * The parameters for the find matches algorithm.
    */
  var FindMatchesParameters: js.UndefOr[typings.awsSdk.glueMod.FindMatchesParameters] = js.native
  
  /**
    * The type of machine learning transform. For information about the types of machine learning transforms, see Creating Machine Learning Transforms.
    */
  var TransformType: typings.awsSdk.glueMod.TransformType = js.native
}
object TransformParameters {
  
  @scala.inline
  def apply(TransformType: TransformType): TransformParameters = {
    val __obj = js.Dynamic.literal(TransformType = TransformType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformParameters]
  }
  
  @scala.inline
  implicit class TransformParametersMutableBuilder[Self <: TransformParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindMatchesParameters(value: FindMatchesParameters): Self = StObject.set(x, "FindMatchesParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindMatchesParametersUndefined: Self = StObject.set(x, "FindMatchesParameters", js.undefined)
    
    @scala.inline
    def setTransformType(value: TransformType): Self = StObject.set(x, "TransformType", value.asInstanceOf[js.Any])
  }
}
