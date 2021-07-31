package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AntennaDemodDecodeDetails extends StObject {
  
  /**
    * Name of an antenna demod decode output node used in a contact.
    */
  var outputNode: js.UndefOr[String] = js.undefined
}
object AntennaDemodDecodeDetails {
  
  @scala.inline
  def apply(): AntennaDemodDecodeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AntennaDemodDecodeDetails]
  }
  
  @scala.inline
  implicit class AntennaDemodDecodeDetailsMutableBuilder[Self <: AntennaDemodDecodeDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputNode(value: String): Self = StObject.set(x, "outputNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputNodeUndefined: Self = StObject.set(x, "outputNode", js.undefined)
  }
}
