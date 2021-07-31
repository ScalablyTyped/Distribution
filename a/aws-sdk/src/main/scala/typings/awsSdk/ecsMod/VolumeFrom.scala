package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeFrom extends StObject {
  
  /**
    * If this value is true, the container has read-only access to the volume. If this value is false, then the container can write to the volume. The default value is false.
    */
  var readOnly: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The name of another container within the same task definition from which to mount volumes.
    */
  var sourceContainer: js.UndefOr[String] = js.undefined
}
object VolumeFrom {
  
  @scala.inline
  def apply(): VolumeFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeFrom]
  }
  
  @scala.inline
  implicit class VolumeFromMutableBuilder[Self <: VolumeFrom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadOnly(value: BoxedBoolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setSourceContainer(value: String): Self = StObject.set(x, "sourceContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceContainerUndefined: Self = StObject.set(x, "sourceContainer", js.undefined)
  }
}
