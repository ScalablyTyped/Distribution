package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Workflow extends StObject {
  
  /**
    * The date and time when the workflow was created.
    */
  var CreatedOn: js.UndefOr[TimestampValue] = js.native
  
  /**
    * A collection of properties to be used as part of each execution of the workflow.
    */
  var DefaultRunProperties: js.UndefOr[WorkflowRunProperties] = js.native
  
  /**
    * A description of the workflow.
    */
  var Description: js.UndefOr[GenericString] = js.native
  
  /**
    * The graph representing all the AWS Glue components that belong to the workflow as nodes and directed connections between them as edges.
    */
  var Graph: js.UndefOr[WorkflowGraph] = js.native
  
  /**
    * The date and time when the workflow was last modified.
    */
  var LastModifiedOn: js.UndefOr[TimestampValue] = js.native
  
  /**
    * The information about the last execution of the workflow.
    */
  var LastRun: js.UndefOr[WorkflowRun] = js.native
  
  /**
    * You can use this parameter to prevent unwanted multiple updates to data, to control costs, or in some cases, to prevent exceeding the maximum number of concurrent runs of any of the component jobs. If you leave this parameter blank, there is no limit to the number of concurrent workflow runs.
    */
  var MaxConcurrentRuns: js.UndefOr[NullableInteger] = js.native
  
  /**
    * The name of the workflow representing the flow.
    */
  var Name: js.UndefOr[NameString] = js.native
}
object Workflow {
  
  @scala.inline
  def apply(): Workflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workflow]
  }
  
  @scala.inline
  implicit class WorkflowMutableBuilder[Self <: Workflow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedOn(value: TimestampValue): Self = StObject.set(x, "CreatedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedOnUndefined: Self = StObject.set(x, "CreatedOn", js.undefined)
    
    @scala.inline
    def setDefaultRunProperties(value: WorkflowRunProperties): Self = StObject.set(x, "DefaultRunProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRunPropertiesUndefined: Self = StObject.set(x, "DefaultRunProperties", js.undefined)
    
    @scala.inline
    def setDescription(value: GenericString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setGraph(value: WorkflowGraph): Self = StObject.set(x, "Graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphUndefined: Self = StObject.set(x, "Graph", js.undefined)
    
    @scala.inline
    def setLastModifiedOn(value: TimestampValue): Self = StObject.set(x, "LastModifiedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedOnUndefined: Self = StObject.set(x, "LastModifiedOn", js.undefined)
    
    @scala.inline
    def setLastRun(value: WorkflowRun): Self = StObject.set(x, "LastRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRunUndefined: Self = StObject.set(x, "LastRun", js.undefined)
    
    @scala.inline
    def setMaxConcurrentRuns(value: NullableInteger): Self = StObject.set(x, "MaxConcurrentRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrentRunsUndefined: Self = StObject.set(x, "MaxConcurrentRuns", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
