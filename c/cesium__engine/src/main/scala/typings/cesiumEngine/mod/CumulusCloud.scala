package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "CumulusCloud")
@js.native
open class CumulusCloud () extends StObject {
  
  /**
    * Gets or sets the brightness of the cloud. This can be used to give clouds
    * a darker, grayer appearance.
    * <br /><br />
    * <div align='center'>
    * <table border='0' cellpadding='5'><tr>
    * <td align='center'><code>cloud.brightness = 1.0;</code><br/><img src='Images/CumulusCloud.brightness1.png' width='250' height='158' /></td>
    * <td align='center'><code>cloud.brightness = 0.6;</code><br/><img src='Images/CumulusCloud.brightness0.6.png' width='250' height='158' /></td>
    * <td align='center'><code>cloud.brightness = 0.0;</code><br/><img src='Images/CumulusCloud.brightness0.png' width='250' height='158' /></td>
    * </tr></table>
    * </div>
    */
  var brightness: Double = js.native
  
  /**
    * Sets the color of the cloud
    */
  var color: Color = js.native
  
  /**
    * <p>Gets or sets the maximum size of the cumulus cloud rendered on the billboard.
    * This defines a maximum ellipsoid volume that the cloud can appear in.
    * Rather than guaranteeing a specific size, this specifies a boundary for the
    * cloud to appear in, and changing it can affect the shape of the cloud.</p>
    * <p>Changing the z-value of <code>maximumSize</code> has the most dramatic effect
    * on the cloud's appearance because it changes the depth of the cloud, and thus the
    * positions at which the cloud-shaping texture is sampled.</p>
    * <div align='center'>
    * <table border='0' cellpadding='5'>
    * <tr>
    *   <td align='center'>
    *     <code>cloud.maximumSize = new Cesium.Cartesian3(14, 9, 10);</code><br/>
    *     <img src='Images/CumulusCloud.maximumSizex14y9z10.png' width='250' height='158' />
    *   </td>
    *   <td align='center'>
    *     <code>cloud.maximumSize.x = 25;</code><br/>
    *     <img src='Images/CumulusCloud.maximumSizex25.png' width='250' height='158' />
    *   </td>
    * </tr>
    * <tr>
    *   <td align='center'>
    *     <code>cloud.maximumSize.y = 5;</code><br/>
    *     <img src='Images/CumulusCloud.maximumSizey5.png' width='250' height='158' />
    *   </td>
    *   <td align='center'>
    *     <code>cloud.maximumSize.z = 17;</code><br/>
    *     <img src='Images/CumulusCloud.maximumSizez17.png' width='250' height='158' />
    *   </td>
    * </tr>
    * </table>
    * </div>
    *
    * <p>To modify the billboard's actual size, modify the cloud's <code>scale</code> property.</p>
    */
  var maximumSize: Cartesian3 = js.native
  
  /**
    * Gets or sets the Cartesian position of this cumulus cloud.
    */
  var position: Cartesian3 = js.native
  
  /**
    * <p>Gets or sets the scale of the cumulus cloud billboard in meters.
    * The <code>scale</code> property will affect the size of the billboard,
    * but not the cloud's actual appearance.</p>
    * <div align='center'>
    * <table border='0' cellpadding='5'><tr>
    * <td align='center'>
    *   <code>cloud.scale = new Cesium.Cartesian2(12, 8);</code><br/>
    *   <img src='Images/CumulusCloud.scalex12y8.png' width='250' height='158' />
    * </td>
    * <td align='center'>
    *   <code>cloud.scale = new Cesium.Cartesian2(24, 10);</code><br/>
    *   <img src='Images/CumulusCloud.scalex24y10.png' width='250' height='158' />
    * </td>
    * </tr></table>
    * </div>
    *
    * <p>To modify the cloud's appearance, modify its <code>maximumSize</code>
    * and <code>slice</code> properties.</p>
    */
  var scale: Cartesian2 = js.native
  
  /**
    * Determines if this cumulus cloud will be shown.  Use this to hide or show a cloud, instead
    * of removing it and re-adding it to the collection.
    */
  var show: Boolean = js.native
  
  /**
    * <p>Gets or sets the "slice" of the cloud that is rendered on the billboard, i.e.
    * the specific cross-section of the cloud chosen for the billboard's appearance.
    * Given a value between 0 and 1, the slice specifies how deeply into the cloud
    * to intersect based on its maximum size in the z-direction.</p>
    * <div align='center'>
    * <table border='0' cellpadding='5'><tr>
    * <td align='center'><code>cloud.slice = 0.32;</code><br/><img src='Images/CumulusCloud.slice0.32.png' width='250' height='158' /></td>
    * <td align='center'><code>cloud.slice = 0.5;</code><br/><img src='Images/CumulusCloud.slice0.5.png' width='250' height='158' /></td>
    * <td align='center'><code>cloud.slice = 0.6;</code><br/><img src='Images/CumulusCloud.slice0.6.png' width='250' height='158' /></td>
    * </tr></table>
    * </div>
    *
    * <br />
    * <p>Due to the nature in which this slice is calculated,
    * values below <code>0.2</code> may result in cross-sections that are too small,
    * and the edge of the ellipsoid will be visible. Similarly, values above <code>0.7</code>
    * will cause the cloud to appear smaller. Values outside the range <code>[0.1, 0.9]</code>
    * should be avoided entirely because they do not produce desirable results.</p>
    *
    * <div align='center'>
    * <table border='0' cellpadding='5'><tr>
    * <td align='center'><code>cloud.slice = 0.08;</code><br/><img src='Images/CumulusCloud.slice0.08.png' width='250' height='158' /></td>
    * <td align='center'><code>cloud.slice = 0.8;</code><br/><img src='Images/CumulusCloud.slice0.8.png' width='250' height='158' /></td>
    * </tr></table>
    * </div>
    *
    * <p>If <code>slice</code> is set to a negative number, the cloud will not render a cross-section.
    * Instead, it will render the outside of the ellipsoid that is visible. For clouds with
    * small values of `maximumSize.z`, this can produce good-looking results, but for larger
    * clouds, this can result in a cloud that is undesirably warped to the ellipsoid volume.</p>
    *
    * <div align='center'>
    * <table border='0' cellpadding='5'><tr>
    * <td align='center'>
    *  <code>cloud.slice = -1.0;<br/>cloud.maximumSize.z = 18;</code><br/>
    *  <img src='Images/CumulusCloud.slice-1z18.png' width='250' height='158' />
    * </td>
    * <td align='center'>
    *   <code>cloud.slice = -1.0;<br/>cloud.maximumSize.z = 30;</code><br/>
    *   <img src='Images/CumulusCloud.slice-1z30.png' width='250' height='158' /></td>
    * </tr></table>
    * </div>
    */
  var slice: Double = js.native
}
