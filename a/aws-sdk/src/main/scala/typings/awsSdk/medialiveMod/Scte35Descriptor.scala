package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scte35Descriptor extends StObject {
  
  /**
    * SCTE-35 Descriptor Settings.
    */
  var Scte35DescriptorSettings: typings.awsSdk.medialiveMod.Scte35DescriptorSettings
}
object Scte35Descriptor {
  
  @scala.inline
  def apply(Scte35DescriptorSettings: Scte35DescriptorSettings): Scte35Descriptor = {
    val __obj = js.Dynamic.literal(Scte35DescriptorSettings = Scte35DescriptorSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte35Descriptor]
  }
  
  @scala.inline
  implicit class Scte35DescriptorMutableBuilder[Self <: Scte35Descriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScte35DescriptorSettings(value: Scte35DescriptorSettings): Self = StObject.set(x, "Scte35DescriptorSettings", value.asInstanceOf[js.Any])
  }
}
