package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EC2TagSet extends StObject {
  
  /**
    * A list that contains other lists of EC2 instance tag groups. For an instance to be included in the deployment group, it must be identified by all of the tag groups in the list.
    */
  var ec2TagSetList: js.UndefOr[EC2TagSetList] = js.native
}
object EC2TagSet {
  
  @scala.inline
  def apply(): EC2TagSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2TagSet]
  }
  
  @scala.inline
  implicit class EC2TagSetMutableBuilder[Self <: EC2TagSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEc2TagSetList(value: EC2TagSetList): Self = StObject.set(x, "ec2TagSetList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2TagSetListUndefined: Self = StObject.set(x, "ec2TagSetList", js.undefined)
    
    @scala.inline
    def setEc2TagSetListVarargs(value: EC2TagFilterList*): Self = StObject.set(x, "ec2TagSetList", js.Array(value :_*))
  }
}
