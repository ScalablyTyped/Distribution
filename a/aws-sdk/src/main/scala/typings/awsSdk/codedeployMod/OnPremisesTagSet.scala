package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnPremisesTagSet extends StObject {
  
  /**
    * A list that contains other lists of on-premises instance tag groups. For an instance to be included in the deployment group, it must be identified by all of the tag groups in the list.
    */
  var onPremisesTagSetList: js.UndefOr[OnPremisesTagSetList] = js.native
}
object OnPremisesTagSet {
  
  @scala.inline
  def apply(): OnPremisesTagSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnPremisesTagSet]
  }
  
  @scala.inline
  implicit class OnPremisesTagSetMutableBuilder[Self <: OnPremisesTagSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnPremisesTagSetList(value: OnPremisesTagSetList): Self = StObject.set(x, "onPremisesTagSetList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesTagSetListUndefined: Self = StObject.set(x, "onPremisesTagSetList", js.undefined)
    
    @scala.inline
    def setOnPremisesTagSetListVarargs(value: TagFilterList*): Self = StObject.set(x, "onPremisesTagSetList", js.Array(value :_*))
  }
}
