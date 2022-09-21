package typings.cesium

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Ray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rayMod {
  
  @JSImport("cesium/Source/Core/Ray", JSImport.Default)
  @js.native
  open class default () extends Ray {
    def this(origin: Cartesian3) = this()
    def this(origin: Unit, direction: Cartesian3) = this()
    def this(origin: Cartesian3, direction: Cartesian3) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/Ray", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Duplicates a Ray instance.
      * @param ray - The ray to duplicate.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Ray instance if one was not provided. (Returns undefined if ray is undefined)
      */
    inline def clone(ray: Ray): Ray = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(ray.asInstanceOf[js.Any]).asInstanceOf[Ray]
    inline def clone(ray: Ray, result: Ray): Ray = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(ray.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Ray]
    
    /**
      * Computes the point along the ray given by r(t) = o + t*d,
      * where o is the origin of the ray and d is the direction.
      * @example
      * //Get the first intersection point of a ray and an ellipsoid.
      * const intersection = Cesium.IntersectionTests.rayEllipsoid(ray, ellipsoid);
      * const point = Cesium.Ray.getPoint(ray, intersection.start);
      * @param ray - The ray.
      * @param t - A scalar value.
      * @param [result] - The object in which the result will be stored.
      * @returns The modified result parameter, or a new instance if none was provided.
      */
    inline def getPoint(ray: Ray, t: Double): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getPoint")(ray.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
    inline def getPoint(ray: Ray, t: Double, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getPoint")(ray.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  }
}
