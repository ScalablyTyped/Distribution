package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Cesium3DTileStyle")
@js.native
open class Cesium3DTileStyle () extends StObject {
  def this(style: Any) = this()
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>anchorLineColor</code> property. Alternatively a string or object defining a color style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>Color</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override anchorLineColor expression with a string
    * style.anchorLineColor = 'color("blue")';
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override anchorLineColor expression with a condition
    * style.anchorLineColor = {
    *     conditions : [
    *         ['${height} > 2', 'color("cyan")'],
    *         ['true', 'color("blue")']
    *     ]
    * };
    */
  var anchorLineColor: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>anchorLineEnabled</code> property. Alternatively a string or object defining a boolean style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>Boolean</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override anchorLineEnabled expression with a string
    * style.anchorLineEnabled = 'true';
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override anchorLineEnabled expression with a condition
    * style.anchorLineEnabled = {
    *     conditions : [
    *         ['${height} > 2', 'true'],
    *         ['true', 'false']
    *     ]
    * };
    */
  var anchorLineEnabled: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>backgroundColor</code> property. Alternatively a string or object defining a color style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>Color</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override backgroundColor expression with a string
    * style.backgroundColor = 'color("blue")';
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override backgroundColor expression with a condition
    * style.backgroundColor = {
    *     conditions : [
    *         ['${height} > 2', 'color("cyan")'],
    *         ['true', 'color("blue")']
    *     ]
    * };
    */
  var backgroundColor: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>backgroundEnabled</code> property. Alternatively a string or object defining a boolean style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>Boolean</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override backgroundEnabled expression with a string
    * style.backgroundEnabled = 'true';
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override backgroundEnabled expression with a condition
    * style.backgroundEnabled = {
    *     conditions : [
    *         ['${height} > 2', 'true'],
    *         ['true', 'false']
    *     ]
    * };
    */
  var backgroundEnabled: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>backgroundPadding</code> property. Alternatively a string or object defining a vec2 style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>Cartesian2</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override backgroundPadding expression with a string
    * style.backgroundPadding = 'vec2(5.0, 7.0)';
    * style.backgroundPadding.evaluate(feature); // returns a Cartesian2
    */
  var backgroundPadding: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>color</code> property. Alternatively a string or object defining a color style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>Color</code>.
    * </p>
    * <p>
    * This expression is applicable to all tile formats.
    * </p>
    * @example
    * const style = new Cesium3DTileStyle({
    *     color : '(${Temperature} > 90) ? color("red") : color("white")'
    * });
    * style.color.evaluateColor(feature, result); // returns a Cesium.Color object
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override color expression with a custom function
    * style.color = {
    *     evaluateColor : function(feature, result) {
    *         return Cesium.Color.clone(Cesium.Color.WHITE, result);
    *     }
    * };
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override color expression with a string
    * style.color = 'color("blue")';
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override color expression with a condition
    * style.color = {
    *     conditions : [
    *         ['${height} > 2', 'color("cyan")'],
    *         ['true', 'color("blue")']
    *     ]
    * };
    */
  var color: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>disableDepthTestDistance</code> property. Alternatively a string or object defining a number style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>Number</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override disableDepthTestDistance expression with a string
    * style.disableDepthTestDistance = '1000.0';
    * style.disableDepthTestDistance.evaluate(feature); // returns a Number
    */
  var disableDepthTestDistance: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>distanceDisplayCondition</code> property. Alternatively a string or object defining a vec2 style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>Cartesian2</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override distanceDisplayCondition expression with a string
    * style.distanceDisplayCondition = 'vec2(0.0, 5.5e6)';
    * style.distanceDisplayCondition.evaluate(feature); // returns a Cartesian2
    */
  var distanceDisplayCondition: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>font</code> property. Alternatively a string or object defining a string style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>String</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium3DTileStyle({
    *     font : '(${Temperature} > 90) ? "30px Helvetica" : "24px Helvetica"'
    * });
    * style.font.evaluate(feature); // returns a String
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override font expression with a custom function
    * style.font = {
    *     evaluate : function(feature) {
    *         return '24px Helvetica';
    *     }
    * };
    */
  var font: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>heightOffset</code> property. Alternatively a string or object defining a number style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>Number</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override heightOffset expression with a string
    * style.heightOffset = '2.0';
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override heightOffset expression with a condition
    * style.heightOffset = {
    *     conditions : [
    *         ['${height} > 2', '4.0'],
    *         ['true', '2.0']
    *     ]
    * };
    */
  var heightOffset: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>horizontalOrigin</code> property. Alternatively a string or object defining a number style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>HorizontalOrigin</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium3DTileStyle({
    *     horizontalOrigin : HorizontalOrigin.LEFT
    * });
    * style.horizontalOrigin.evaluate(feature); // returns a HorizontalOrigin
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override horizontalOrigin expression with a custom function
    * style.horizontalOrigin = {
    *     evaluate : function(feature) {
    *         return HorizontalOrigin.CENTER;
    *     }
    * };
    */
  var horizontalOrigin: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>image</code> property. Alternatively a string or object defining a string style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>String</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium3DTileStyle({
    *     image : '(${Temperature} > 90) ? "/url/to/image1" : "/url/to/image2"'
    * });
    * style.image.evaluate(feature); // returns a String
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override image expression with a custom function
    * style.image = {
    *     evaluate : function(feature) {
    *         return '/url/to/image';
    *     }
    * };
    */
  var image: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>labelColor</code> property. Alternatively a string or object defining a color style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>Color</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override labelColor expression with a string
    * style.labelColor = 'color("blue")';
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override labelColor expression with a condition
    * style.labelColor = {
    *     conditions : [
    *         ['${height} > 2', 'color("cyan")'],
    *         ['true', 'color("blue")']
    *     ]
    * };
    */
  var labelColor: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>labelHorizontalOrigin</code> property. Alternatively a string or object defining a number style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>HorizontalOrigin</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium3DTileStyle({
    *     labelHorizontalOrigin : HorizontalOrigin.LEFT
    * });
    * style.labelHorizontalOrigin.evaluate(feature); // returns a HorizontalOrigin
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override labelHorizontalOrigin expression with a custom function
    * style.labelHorizontalOrigin = {
    *     evaluate : function(feature) {
    *         return HorizontalOrigin.CENTER;
    *     }
    * };
    */
  var labelHorizontalOrigin: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>labelOutlineColor</code> property. Alternatively a string or object defining a color style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>Color</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override labelOutlineColor expression with a string
    * style.labelOutlineColor = 'color("blue")';
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override labelOutlineColor expression with a condition
    * style.labelOutlineColor = {
    *     conditions : [
    *         ['${height} > 2', 'color("cyan")'],
    *         ['true', 'color("blue")']
    *     ]
    * };
    */
  var labelOutlineColor: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>labelOutlineWidth</code> property. Alternatively a string or object defining a number style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>Number</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override labelOutlineWidth expression with a string
    * style.labelOutlineWidth = '5';
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override labelOutlineWidth expression with a condition
    * style.labelOutlineWidth = {
    *     conditions : [
    *         ['${height} > 2', '5'],
    *         ['true', '0']
    *     ]
    * };
    */
  var labelOutlineWidth: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>label style</code> property. Alternatively a string or object defining a number style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>LabelStyle</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium3DTileStyle({
    *     labelStyle : `(\${Temperature} > 90) ? ${LabelStyle.FILL_AND_OUTLINE} : ${LabelStyle.FILL}`
    * });
    * style.labelStyle.evaluate(feature); // returns a LabelStyle
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override labelStyle expression with a custom function
    * style.labelStyle = {
    *     evaluate : function(feature) {
    *         return LabelStyle.FILL;
    *     }
    * };
    */
  var labelStyle: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>labelText</code> property. Alternatively a string or object defining a string style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>String</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium3DTileStyle({
    *     labelText : '(${Temperature} > 90) ? ">90" : "<=90"'
    * });
    * style.labelText.evaluate(feature); // returns a String
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override labelText expression with a custom function
    * style.labelText = {
    *     evaluate : function(feature) {
    *         return 'Example label text';
    *     }
    * };
    */
  var labelText: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>labelVerticalOrigin</code> property. Alternatively a string or object defining a number style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>VerticalOrigin</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium3DTileStyle({
    *     labelVerticalOrigin : VerticalOrigin.TOP
    * });
    * style.labelVerticalOrigin.evaluate(feature); // returns a VerticalOrigin
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override labelVerticalOrigin expression with a custom function
    * style.labelVerticalOrigin = {
    *     evaluate : function(feature) {
    *         return VerticalOrigin.CENTER;
    *     }
    * };
    */
  var labelVerticalOrigin: StyleExpression = js.native
  
  /**
    * Gets or sets the object containing application-specific expression that can be explicitly
    * evaluated, e.g., for display in a UI.
    * @example
    * const style = new Cesium3DTileStyle({
    *     meta : {
    *         description : '"Building id ${id} has height ${Height}."'
    *     }
    * });
    * style.meta.description.evaluate(feature); // returns a String with the substituted variables
    */
  var meta: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>pointOutlineColor</code> property. Alternatively a string or object defining a color style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>Color</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override pointOutlineColor expression with a string
    * style.pointOutlineColor = 'color("blue")';
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override pointOutlineColor expression with a condition
    * style.pointOutlineColor = {
    *     conditions : [
    *         ['${height} > 2', 'color("cyan")'],
    *         ['true', 'color("blue")']
    *     ]
    * };
    */
  var pointOutlineColor: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>pointOutlineWidth</code> property. Alternatively a string or object defining a number style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>Number</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override pointOutlineWidth expression with a string
    * style.pointOutlineWidth = '5';
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override pointOutlineWidth expression with a condition
    * style.pointOutlineWidth = {
    *     conditions : [
    *         ['${height} > 2', '5'],
    *         ['true', '0']
    *     ]
    * };
    */
  var pointOutlineWidth: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>pointSize</code> property. Alternatively a string or object defining a point size style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>Number</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile or a Point Cloud tile.
    * </p>
    * @example
    * const style = new Cesium3DTileStyle({
    *     pointSize : '(${Temperature} > 90) ? 2.0 : 1.0'
    * });
    * style.pointSize.evaluate(feature); // returns a Number
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override pointSize expression with a custom function
    * style.pointSize = {
    *     evaluate : function(feature) {
    *         return 1.0;
    *     }
    * };
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override pointSize expression with a number
    * style.pointSize = 1.0;
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override pointSize expression with a string
    * style.pointSize = '${height} / 10';
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override pointSize expression with a condition
    * style.pointSize =  {
    *     conditions : [
    *         ['${height} > 2', '1.0'],
    *         ['true', '2.0']
    *     ]
    * };
    */
  var pointSize: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>scaleByDistance</code> property. Alternatively a string or object defining a vec4 style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>Cartesian4</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override scaleByDistance expression with a string
    * style.scaleByDistance = 'vec4(1.5e2, 2.0, 1.5e7, 0.5)';
    * style.scaleByDistance.evaluate(feature); // returns a Cartesian4
    */
  var scaleByDistance: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>show</code> property. Alternatively a boolean, string, or object defining a show style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return or convert to a <code>Boolean</code>.
    * </p>
    * <p>
    * This expression is applicable to all tile formats.
    * </p>
    * @example
    * const style = new Cesium3DTileStyle({
    *     show : '(regExp("^Chest").test(${County})) && (${YearBuilt} >= 1970)'
    * });
    * style.show.evaluate(feature); // returns true or false depending on the feature's properties
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override show expression with a custom function
    * style.show = {
    *     evaluate : function(feature) {
    *         return true;
    *     }
    * };
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override show expression with a boolean
    * style.show = true;
    * };
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override show expression with a string
    * style.show = '${Height} > 0';
    * };
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override show expression with a condition
    * style.show = {
    *     conditions: [
    *         ['${height} > 2', 'false'],
    *         ['true', 'true']
    *     ];
    * };
    */
  var show: StyleExpression = js.native
  
  /**
    * Gets the object defining the style using the
    * {@link https://github.com/CesiumGS/3d-tiles/tree/main/specification/Styling|3D Tiles Styling language}.
    */
  val style: Any = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>translucencyByDistance</code> property. Alternatively a string or object defining a vec4 style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>Cartesian4</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override translucencyByDistance expression with a string
    * style.translucencyByDistance = 'vec4(1.5e2, 1.0, 1.5e7, 0.2)';
    * style.translucencyByDistance.evaluate(feature); // returns a Cartesian4
    */
  var translucencyByDistance: StyleExpression = js.native
  
  /**
    * Gets or sets the {@link StyleExpression} object used to evaluate the style's <code>verticalOrigin</code> property. Alternatively a string or object defining a number style can be used.
    * The getter will return the internal {@link Expression} or {@link ConditionsExpression}, which may differ from the value provided to the setter.
    * <p>
    * The expression must return a <code>VerticalOrigin</code>.
    * </p>
    * <p>
    * This expression is only applicable to point features in a Vector tile.
    * </p>
    * @example
    * const style = new Cesium3DTileStyle({
    *     verticalOrigin : VerticalOrigin.TOP
    * });
    * style.verticalOrigin.evaluate(feature); // returns a VerticalOrigin
    * @example
    * const style = new Cesium.Cesium3DTileStyle();
    * // Override verticalOrigin expression with a custom function
    * style.verticalOrigin = {
    *     evaluate : function(feature) {
    *         return VerticalOrigin.CENTER;
    *     }
    * };
    */
  var verticalOrigin: StyleExpression = js.native
}
