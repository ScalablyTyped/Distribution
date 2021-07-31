package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPRange extends StObject {
  
  /**
    * The IP range in Classless Inter-Domain Routing (CIDR) notation.
    */
  var CIDRIP: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the IP range, for example, "authorized".
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The list of tags for the IP range.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
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
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
