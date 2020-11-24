package typings.d3Force.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimulationLinkDatum[NodeDatum /* <: SimulationNodeDatum */] extends js.Object {
  
  /**
    * The zero-based index into the links array. Internally generated when calling ForceLink.links(...)
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Link’s source node.
    * For convenience, a link’s source and target properties may be initialized using numeric or string identifiers rather than object references; see link.id.
    * When the link force is initialized (or re-initialized, as when the nodes or links change), any link.source or link.target property which is not an object
    * is replaced by an object reference to the corresponding node with the given identifier.
    * After initialization, the source property represents the source node object.
    */
  var source: NodeDatum | String | Double = js.native
  
  /**
    * Link’s source link
    * For convenience, a link’s source and target properties may be initialized using numeric or string identifiers rather than object references; see link.id.
    * When the link force is initialized (or re-initialized, as when the nodes or links change), any link.source or link.target property which is not an object
    * is replaced by an object reference to the corresponding node with the given identifier.
    * After initialization, the target property represents the target node object.
    */
  var target: NodeDatum | String | Double = js.native
}
object SimulationLinkDatum {
  
  @scala.inline
  def apply[NodeDatum /* <: SimulationNodeDatum */](source: NodeDatum | String | Double, target: NodeDatum | String | Double): SimulationLinkDatum[NodeDatum] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulationLinkDatum[NodeDatum]]
  }
  
  @scala.inline
  implicit class SimulationLinkDatumOps[Self <: SimulationLinkDatum[_], NodeDatum /* <: SimulationNodeDatum */] (val x: Self with SimulationLinkDatum[NodeDatum]) extends AnyVal {
    
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
    def setSource(value: NodeDatum | String | Double): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: NodeDatum | String | Double): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
}
