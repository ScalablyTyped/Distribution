package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProjectInput extends StObject {
  
  /**
    * The name of the project to describe.
    */
  var ProjectName: ProjectEntityName
}
object DescribeProjectInput {
  
  inline def apply(ProjectName: ProjectEntityName): DescribeProjectInput = {
    val __obj = js.Dynamic.literal(ProjectName = ProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectInput]
  }
  
  extension [Self <: DescribeProjectInput](x: Self) {
    
    inline def setProjectName(value: ProjectEntityName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
  }
}
