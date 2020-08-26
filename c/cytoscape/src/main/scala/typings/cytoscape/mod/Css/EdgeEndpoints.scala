package typings.cytoscape.mod.Css

import typings.cytoscape.cytoscapeStrings.`inside-to-node`
import typings.cytoscape.cytoscapeStrings.`outside-to-line-or-label`
import typings.cytoscape.cytoscapeStrings.`outside-to-line`
import typings.cytoscape.cytoscapeStrings.`outside-to-node-or-label`
import typings.cytoscape.cytoscapeStrings.`outside-to-node`
import typings.cytoscape.mod.EdgeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * https://js.cytoscape.org/#style/edge-endpoints
  */
@js.native
trait EdgeEndpoints[SingularType /* <: EdgeSingular */] extends js.Object {
  /** Specifies the endpoint of the source side of the edge  */
  var `source-endpoint`: PropertyValue[
    SingularType, 
    `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
  ] = js.native
  /** Specifies the endpoint of the target side of the edge  */
  var `target-endpoint`: PropertyValue[
    SingularType, 
    `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
  ] = js.native
}

object EdgeEndpoints {
  @scala.inline
  def apply[/* <: typings.cytoscape.mod.EdgeSingular */ SingularType](
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
  implicit class EdgeEndpointsOps[Self <: EdgeEndpoints[_], /* <: typings.cytoscape.mod.EdgeSingular */ SingularType] (val x: Self with EdgeEndpoints[SingularType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setSource-endpointFunction1`(
      value: SingularType => `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
    ): Self = this.set("source-endpoint", js.Any.fromFunction1(value))
    @scala.inline
    def `setSource-endpoint`(
      value: PropertyValue[
          SingularType, 
          `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
        ]
    ): Self = this.set("source-endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def `setTarget-endpointFunction1`(
      value: SingularType => `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
    ): Self = this.set("target-endpoint", js.Any.fromFunction1(value))
    @scala.inline
    def `setTarget-endpoint`(
      value: PropertyValue[
          SingularType, 
          `inside-to-node` | `outside-to-node` | `outside-to-node-or-label` | `outside-to-line` | `outside-to-line-or-label` | String
        ]
    ): Self = this.set("target-endpoint", value.asInstanceOf[js.Any])
  }
  
}

