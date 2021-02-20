package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobScopeTerm extends StObject {
  
  /**
    * A property-based condition that defines a property, operator, and one or more values for including or excluding an object from the job.
    */
  var simpleScopeTerm: js.UndefOr[SimpleScopeTerm] = js.native
  
  /**
    * A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or excluding an object from the job.
    */
  var tagScopeTerm: js.UndefOr[TagScopeTerm] = js.native
}
object JobScopeTerm {
  
  @scala.inline
  def apply(): JobScopeTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobScopeTerm]
  }
  
  @scala.inline
  implicit class JobScopeTermMutableBuilder[Self <: JobScopeTerm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSimpleScopeTerm(value: SimpleScopeTerm): Self = StObject.set(x, "simpleScopeTerm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleScopeTermUndefined: Self = StObject.set(x, "simpleScopeTerm", js.undefined)
    
    @scala.inline
    def setTagScopeTerm(value: TagScopeTerm): Self = StObject.set(x, "tagScopeTerm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagScopeTermUndefined: Self = StObject.set(x, "tagScopeTerm", js.undefined)
  }
}
