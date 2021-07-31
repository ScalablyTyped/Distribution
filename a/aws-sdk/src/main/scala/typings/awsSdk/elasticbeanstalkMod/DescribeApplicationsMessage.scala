package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationsMessage extends StObject {
  
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to only include those with the specified names.
    */
  var ApplicationNames: js.UndefOr[ApplicationNamesList] = js.undefined
}
object DescribeApplicationsMessage {
  
  @scala.inline
  def apply(): DescribeApplicationsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeApplicationsMessage]
  }
  
  @scala.inline
  implicit class DescribeApplicationsMessageMutableBuilder[Self <: DescribeApplicationsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationNames(value: ApplicationNamesList): Self = StObject.set(x, "ApplicationNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNamesUndefined: Self = StObject.set(x, "ApplicationNames", js.undefined)
    
    @scala.inline
    def setApplicationNamesVarargs(value: ApplicationName*): Self = StObject.set(x, "ApplicationNames", js.Array(value :_*))
  }
}
