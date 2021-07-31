package typings.cytoscape.mod.Css

import typings.cytoscape.cytoscapeStrings.`inside-to-node`
import typings.cytoscape.cytoscapeStrings.`outside-to-line-or-label`
import typings.cytoscape.cytoscapeStrings.`outside-to-line`
import typings.cytoscape.cytoscapeStrings.`outside-to-node-or-label`
import typings.cytoscape.cytoscapeStrings.`outside-to-node`
import typings.cytoscape.mod.EdgeSingular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * https://js.cytoscape.org/#style/edge-endpoints
  */
trait EdgeEndpoints[SingularType /* <: EdgeSingular */] extends StObject {
  
  /** Specifies the endpoint of the source side of the edge  */
  var `source-endpoint`: PropertyValue[
    SingularType, 
    `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
  ]
  
  /** Specifies the endpoint of the target side of the edge  */
  var `target-endpoint`: PropertyValue[
    SingularType, 
    `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
  ]
}
object EdgeEndpoints {
  
  @scala.inline
  def apply[SingularType /* <: EdgeSingular */](
    `source-endpoint`: PropertyValue[
      SingularType, 
      `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
    ],
    `target-endpoint`: PropertyValue[
      SingularType, 
      `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
    ]
  ): EdgeEndpoints[SingularType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("source-endpoint")(`source-endpoint`.asInstanceOf[js.Any])
    __obj.updateDynamic("target-endpoint")(`target-endpoint`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeEndpoints[SingularType]]
  }
  
  @scala.inline
  implicit class EdgeEndpointsMutableBuilder[Self <: EdgeEndpoints[?], SingularType /* <: EdgeSingular */] (val x: Self & EdgeEndpoints[SingularType]) extends AnyVal {
    
    @scala.inline
    def `setSource-endpoint`(
      value: PropertyValue[
          SingularType, 
          `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
        ]
    ): Self = StObject.set(x, "source-endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSource-endpointFunction1`(
      value: SingularType => `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
    ): Self = StObject.set(x, "source-endpoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-endpoint`(
      value: PropertyValue[
          SingularType, 
          `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
        ]
    ): Self = StObject.set(x, "target-endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTarget-endpointFunction1`(
      value: SingularType => `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
    ): Self = StObject.set(x, "target-endpoint", js.Any.fromFunction1(value))
  }
}
