package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EC2TagSet extends StObject {
  
  /**
    * A list that contains other lists of EC2 instance tag groups. For an instance to be included in the deployment group, it must be identified by all of the tag groups in the list.
    */
  var ec2TagSetList: js.UndefOr[EC2TagSetList] = js.undefined
}
object EC2TagSet {
  
  inline def apply(): EC2TagSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2TagSet]
  }
  
  extension [Self <: EC2TagSet](x: Self) {
    
    inline def setEc2TagSetList(value: EC2TagSetList): Self = StObject.set(x, "ec2TagSetList", value.asInstanceOf[js.Any])
    
    inline def setEc2TagSetListUndefined: Self = StObject.set(x, "ec2TagSetList", js.undefined)
    
    inline def setEc2TagSetListVarargs(value: EC2TagFilterList*): Self = StObject.set(x, "ec2TagSetList", js.Array(value :_*))
  }
}
