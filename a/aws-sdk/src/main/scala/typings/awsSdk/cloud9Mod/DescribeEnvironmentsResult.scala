package typings.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEnvironmentsResult extends StObject {
  
  /**
    * Information about the environments that are returned.
    */
  var environments: js.UndefOr[EnvironmentList] = js.undefined
}
object DescribeEnvironmentsResult {
  
  @scala.inline
  def apply(): DescribeEnvironmentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentsResult]
  }
  
  @scala.inline
  implicit class DescribeEnvironmentsResultMutableBuilder[Self <: DescribeEnvironmentsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironments(value: EnvironmentList): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
    
    @scala.inline
    def setEnvironmentsVarargs(value: Environment*): Self = StObject.set(x, "environments", js.Array(value :_*))
  }
}
