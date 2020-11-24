package typings.d3Graphviz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphvizOptions extends js.Object {
  
  var convertEqualSidedPolygons: js.UndefOr[Boolean] = js.native
  
  var engine: js.UndefOr[Engine] = js.native
  
  var fade: js.UndefOr[Boolean] = js.native
  
  var fit: js.UndefOr[Boolean] = js.native
  
  var growEnteringEdges: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var keyMode: js.UndefOr[KeyMode] = js.native
  
  var scale: js.UndefOr[Double] = js.native
  
  var totalMemory: js.UndefOr[Double] = js.native
  
  var tweenPaths: js.UndefOr[Boolean] = js.native
  
  var tweenPrecision: js.UndefOr[Double | String] = js.native
  
  var tweenShapes: js.UndefOr[Boolean] = js.native
  
  var useWorker: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var zoom: js.UndefOr[Boolean] = js.native
  
  var zoomScaleExtent: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var zoomTranslateExtent: js.UndefOr[js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]] = js.native
}
object GraphvizOptions {
  
  @scala.inline
  def apply(): GraphvizOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphvizOptions]
  }
  
  @scala.inline
  implicit class GraphvizOptionsOps[Self <: GraphvizOptions] (val x: Self) extends AnyVal {
    
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
    def setConvertEqualSidedPolygons(value: Boolean): Self = this.set("convertEqualSidedPolygons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertEqualSidedPolygons: Self = this.set("convertEqualSidedPolygons", js.undefined)
    
    @scala.inline
    def setEngine(value: Engine): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    
    @scala.inline
    def setFade(value: Boolean): Self = this.set("fade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFade: Self = this.set("fade", js.undefined)
    
    @scala.inline
    def setFit(value: Boolean): Self = this.set("fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFit: Self = this.set("fit", js.undefined)
    
    @scala.inline
    def setGrowEnteringEdges(value: Boolean): Self = this.set("growEnteringEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrowEnteringEdges: Self = this.set("growEnteringEdges", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setKeyMode(value: KeyMode): Self = this.set("keyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyMode: Self = this.set("keyMode", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setTotalMemory(value: Double): Self = this.set("totalMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalMemory: Self = this.set("totalMemory", js.undefined)
    
    @scala.inline
    def setTweenPaths(value: Boolean): Self = this.set("tweenPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTweenPaths: Self = this.set("tweenPaths", js.undefined)
    
    @scala.inline
    def setTweenPrecision(value: Double | String): Self = this.set("tweenPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTweenPrecision: Self = this.set("tweenPrecision", js.undefined)
    
    @scala.inline
    def setTweenShapes(value: Boolean): Self = this.set("tweenShapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTweenShapes: Self = this.set("tweenShapes", js.undefined)
    
    @scala.inline
    def setUseWorker(value: Boolean): Self = this.set("useWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseWorker: Self = this.set("useWorker", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setZoom(value: Boolean): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    
    @scala.inline
    def setZoomScaleExtent(value: js.Tuple2[Double, Double]): Self = this.set("zoomScaleExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomScaleExtent: Self = this.set("zoomScaleExtent", js.undefined)
    
    @scala.inline
    def setZoomTranslateExtent(value: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Self = this.set("zoomTranslateExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomTranslateExtent: Self = this.set("zoomTranslateExtent", js.undefined)
  }
}
