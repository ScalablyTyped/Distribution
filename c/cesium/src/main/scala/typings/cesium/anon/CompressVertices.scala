package typings.cesium.anon

import typings.cesium.mod.GeometryInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompressVertices extends js.Object {
  var allowPicking: js.UndefOr[Boolean] = js.native
  var appearance: js.UndefOr[typings.cesium.mod.Appearance] = js.native
  var asynchronous: js.UndefOr[Boolean] = js.native
  var classificationType: js.UndefOr[typings.cesium.mod.ClassificationType] = js.native
  var compressVertices: js.UndefOr[Boolean] = js.native
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.native
  var debugShowShadowVolume: js.UndefOr[Boolean] = js.native
  var geometryInstances: js.UndefOr[js.Array[GeometryInstance] | GeometryInstance] = js.native
  var interleave: js.UndefOr[Boolean] = js.native
  var releaseGeometryInstances: js.UndefOr[Boolean] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var vertexCacheOptimize: js.UndefOr[Boolean] = js.native
}

object CompressVertices {
  @scala.inline
  def apply(): CompressVertices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompressVertices]
  }
  @scala.inline
  implicit class CompressVerticesOps[Self <: CompressVertices] (val x: Self) extends AnyVal {
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
    def setAllowPicking(value: Boolean): Self = this.set("allowPicking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowPicking: Self = this.set("allowPicking", js.undefined)
    @scala.inline
    def setAppearance(value: typings.cesium.mod.Appearance): Self = this.set("appearance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppearance: Self = this.set("appearance", js.undefined)
    @scala.inline
    def setAsynchronous(value: Boolean): Self = this.set("asynchronous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsynchronous: Self = this.set("asynchronous", js.undefined)
    @scala.inline
    def setClassificationType(value: typings.cesium.mod.ClassificationType): Self = this.set("classificationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassificationType: Self = this.set("classificationType", js.undefined)
    @scala.inline
    def setCompressVertices(value: Boolean): Self = this.set("compressVertices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressVertices: Self = this.set("compressVertices", js.undefined)
    @scala.inline
    def setDebugShowBoundingVolume(value: Boolean): Self = this.set("debugShowBoundingVolume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugShowBoundingVolume: Self = this.set("debugShowBoundingVolume", js.undefined)
    @scala.inline
    def setDebugShowShadowVolume(value: Boolean): Self = this.set("debugShowShadowVolume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugShowShadowVolume: Self = this.set("debugShowShadowVolume", js.undefined)
    @scala.inline
    def setGeometryInstancesVarargs(value: GeometryInstance*): Self = this.set("geometryInstances", js.Array(value :_*))
    @scala.inline
    def setGeometryInstances(value: js.Array[GeometryInstance] | GeometryInstance): Self = this.set("geometryInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometryInstances: Self = this.set("geometryInstances", js.undefined)
    @scala.inline
    def setInterleave(value: Boolean): Self = this.set("interleave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterleave: Self = this.set("interleave", js.undefined)
    @scala.inline
    def setReleaseGeometryInstances(value: Boolean): Self = this.set("releaseGeometryInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseGeometryInstances: Self = this.set("releaseGeometryInstances", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setVertexCacheOptimize(value: Boolean): Self = this.set("vertexCacheOptimize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertexCacheOptimize: Self = this.set("vertexCacheOptimize", js.undefined)
  }
  
}

