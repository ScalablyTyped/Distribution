package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workflow extends StObject {
  
  /**
    * This structure indicates the details of the blueprint that this particular workflow is created from.
    */
  var BlueprintDetails: js.UndefOr[typings.awsSdk.glueMod.BlueprintDetails] = js.undefined
  
  /**
    * The date and time when the workflow was created.
    */
  var CreatedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A collection of properties to be used as part of each execution of the workflow. The run properties are made available to each job in the workflow. A job can modify the properties for the next jobs in the flow.
    */
  var DefaultRunProperties: js.UndefOr[WorkflowRunProperties] = js.undefined
  
  /**
    * A description of the workflow.
    */
  var Description: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The graph representing all the Glue components that belong to the workflow as nodes and directed connections between them as edges.
    */
  var Graph: js.UndefOr[WorkflowGraph] = js.undefined
  
  /**
    * The date and time when the workflow was last modified.
    */
  var LastModifiedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The information about the last execution of the workflow.
    */
  var LastRun: js.UndefOr[WorkflowRun] = js.undefined
  
  /**
    * You can use this parameter to prevent unwanted multiple updates to data, to control costs, or in some cases, to prevent exceeding the maximum number of concurrent runs of any of the component jobs. If you leave this parameter blank, there is no limit to the number of concurrent workflow runs.
    */
  var MaxConcurrentRuns: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The name of the workflow.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}
object Workflow {
  
  inline def apply(): Workflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workflow]
  }
  
  extension [Self <: Workflow](x: Self) {
    
    inline def setBlueprintDetails(value: BlueprintDetails): Self = StObject.set(x, "BlueprintDetails", value.asInstanceOf[js.Any])
    
    inline def setBlueprintDetailsUndefined: Self = StObject.set(x, "BlueprintDetails", js.undefined)
    
    inline def setCreatedOn(value: js.Date): Self = StObject.set(x, "CreatedOn", value.asInstanceOf[js.Any])
    
    inline def setCreatedOnUndefined: Self = StObject.set(x, "CreatedOn", js.undefined)
    
    inline def setDefaultRunProperties(value: WorkflowRunProperties): Self = StObject.set(x, "DefaultRunProperties", value.asInstanceOf[js.Any])
    
    inline def setDefaultRunPropertiesUndefined: Self = StObject.set(x, "DefaultRunProperties", js.undefined)
    
    inline def setDescription(value: GenericString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGraph(value: WorkflowGraph): Self = StObject.set(x, "Graph", value.asInstanceOf[js.Any])
    
    inline def setGraphUndefined: Self = StObject.set(x, "Graph", js.undefined)
    
    inline def setLastModifiedOn(value: js.Date): Self = StObject.set(x, "LastModifiedOn", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedOnUndefined: Self = StObject.set(x, "LastModifiedOn", js.undefined)
    
    inline def setLastRun(value: WorkflowRun): Self = StObject.set(x, "LastRun", value.asInstanceOf[js.Any])
    
    inline def setLastRunUndefined: Self = StObject.set(x, "LastRun", js.undefined)
    
    inline def setMaxConcurrentRuns(value: NullableInteger): Self = StObject.set(x, "MaxConcurrentRuns", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentRunsUndefined: Self = StObject.set(x, "MaxConcurrentRuns", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
