package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportVolumeResult extends StObject {
  
  /**
    * Information about the conversion task.
    */
  var ConversionTask: js.UndefOr[typings.awsSdk.ec2Mod.ConversionTask] = js.undefined
}
object ImportVolumeResult {
  
  @scala.inline
  def apply(): ImportVolumeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportVolumeResult]
  }
  
  @scala.inline
  implicit class ImportVolumeResultMutableBuilder[Self <: ImportVolumeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversionTask(value: ConversionTask): Self = StObject.set(x, "ConversionTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionTaskUndefined: Self = StObject.set(x, "ConversionTask", js.undefined)
  }
}
