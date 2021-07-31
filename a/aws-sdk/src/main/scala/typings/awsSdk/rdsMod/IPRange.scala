package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPRange extends StObject {
  
  /**
    * Specifies the IP range.
    */
  var CIDRIP: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the status of the IP range. Status can be "authorizing", "authorized", "revoking", and "revoked".
    */
  var Status: js.UndefOr[String] = js.undefined
}
object IPRange {
  
  @scala.inline
  def apply(): IPRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPRange]
  }
  
  @scala.inline
  implicit class IPRangeMutableBuilder[Self <: IPRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCIDRIP(value: String): Self = StObject.set(x, "CIDRIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCIDRIPUndefined: Self = StObject.set(x, "CIDRIP", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
