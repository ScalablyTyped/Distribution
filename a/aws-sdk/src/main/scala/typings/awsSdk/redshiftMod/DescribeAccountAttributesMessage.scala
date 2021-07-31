package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountAttributesMessage extends StObject {
  
  /**
    * A list of attribute names.
    */
  var AttributeNames: js.UndefOr[AttributeNameList] = js.undefined
}
object DescribeAccountAttributesMessage {
  
  @scala.inline
  def apply(): DescribeAccountAttributesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAttributesMessage]
  }
  
  @scala.inline
  implicit class DescribeAccountAttributesMessageMutableBuilder[Self <: DescribeAccountAttributesMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeNames(value: AttributeNameList): Self = StObject.set(x, "AttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNamesUndefined: Self = StObject.set(x, "AttributeNames", js.undefined)
    
    @scala.inline
    def setAttributeNamesVarargs(value: String*): Self = StObject.set(x, "AttributeNames", js.Array(value :_*))
  }
}
