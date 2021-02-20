package typings.chartist.mod

import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartistSvg extends StObject {
  
  /**
    * The SVG DOM element wrapped by IChartistSvg
    */
  var _node: HTMLElement = js.native
  
  /**
    * Adds one or a space separated list of classes to the current element and ensures the classes are only existing once.
    *
    * @method addClass
    * @param names {string} A white space separated list of class names
    */
  def addClass(names: String): IChartistSvg = js.native
  
  /**
    * The animate function lets you animate the current element with SMIL animations. You can add animations for multiple attributes at the same time by using an animation definition object. This object should contain SMIL animation attributes.
    */
  def animate(animations: IChartistAnimations, guided: Boolean, eventEmitter: js.Object): IChartistSvg = js.native
  
  /**
    * This method will append an element to the current element as a child.
    */
  def append(element: IChartistSvg): IChartistSvg = js.native
  def append(element: IChartistSvg, insertFirst: Boolean): IChartistSvg = js.native
  
  def attr(attributes: String): js.Object | String = js.native
  def attr(attributes: String, ns: String): js.Object | String = js.native
  /**
    * Set attributes on the current SVG element of the wrapper you're currently working on.
    */
  def attr(attributes: js.Object): js.Object | String = js.native
  def attr(attributes: js.Object, ns: String): js.Object | String = js.native
  
  /**
    * Returns an array of class names that are attached to the current wrapper element. This method can not be chained further.
    */
  def classes(): js.Array[String] = js.native
  
  /**
    * Create a new SVG element whose wrapper object will be selected for further operations. This way you can also create nested groups easily.
    */
  def elem(name: String): IChartistSvg = js.native
  def elem(
    name: String,
    attributes: js.UndefOr[scala.Nothing],
    className: js.UndefOr[scala.Nothing],
    insertFirst: Boolean
  ): IChartistSvg = js.native
  def elem(name: String, attributes: js.UndefOr[scala.Nothing], className: String): IChartistSvg = js.native
  def elem(name: String, attributes: js.UndefOr[scala.Nothing], className: String, insertFirst: Boolean): IChartistSvg = js.native
  def elem(name: String, attributes: js.Object): IChartistSvg = js.native
  def elem(name: String, attributes: js.Object, className: js.UndefOr[scala.Nothing], insertFirst: Boolean): IChartistSvg = js.native
  def elem(name: String, attributes: js.Object, className: String): IChartistSvg = js.native
  def elem(name: String, attributes: js.Object, className: String, insertFirst: Boolean): IChartistSvg = js.native
  
  /**
    * This method will clear all child nodes of the current wrapper object.
    */
  def empty(): IChartistSvg = js.native
  
  // this returns an svg wrapper list in the docs, need to see if that's just an array or a special list
  /**
    * This method creates a foreignObject (see https://developer.mozilla.org/en-US/docs/Web/SVG/Element/foreignObject) that allows to embed HTML content into a SVG graphic. With the help of foreignObjects you can enable the usage of regular HTML elements inside of SVG where they are subject for SVG positioning and transformation but the Browser will use the HTML rendering capabilities for the containing DOM.
    */
  def foreignObject(content: js.Any): IChartistSvg = js.native
  def foreignObject(
    content: js.Any,
    attributes: js.UndefOr[scala.Nothing],
    className: js.UndefOr[scala.Nothing],
    insertFirst: Boolean
  ): IChartistSvg = js.native
  def foreignObject(content: js.Any, attributes: js.UndefOr[scala.Nothing], className: String): IChartistSvg = js.native
  def foreignObject(content: js.Any, attributes: js.UndefOr[scala.Nothing], className: String, insertFirst: Boolean): IChartistSvg = js.native
  def foreignObject(content: js.Any, attributes: js.Object): IChartistSvg = js.native
  def foreignObject(content: js.Any, attributes: js.Object, className: js.UndefOr[scala.Nothing], insertFirst: Boolean): IChartistSvg = js.native
  def foreignObject(content: js.Any, attributes: js.Object, className: String): IChartistSvg = js.native
  def foreignObject(content: js.Any, attributes: js.Object, className: String, insertFirst: Boolean): IChartistSvg = js.native
  
  /**
    * "Safe" way to get property value from svg BoundingBox. This is a workaround. Firefox throws an NS_ERROR_FAILURE error if getBBox() is called on an invisible node.
    * THIS IS A WORKAROUND
    */
  def getBBoxProperty(node: SVGElement, prop: String): String = js.native
  
  /**
    * Get element height with fallback to svg BoundingBox or parent container dimensions
    */
  def height(): Double = js.native
  
  /**
    * Returns the parent Chartist.SVG wrapper object
    */
  def parent(): IChartistSvg = js.native
  
  /**
    * Find the first child SVG element of the current element that matches a CSS selector. The returned object is a Chartist.Svg wrapper.
    */
  def querySelector(selector: String): IChartistSvg = js.native
  
  /**
    * Find the all child SVG elements of the current element that match a CSS selector. The returned object is a Chartist.Svg.List wrapper.
    */
  def querySelectorAll(selector: String): js.Any = js.native
  
  /**
    * This method will cause the current wrapper to remove itself from its parent wrapper. Use this method if you'd like to get rid of an element in a given DOM structure.
    */
  def remove(): IChartistSvg = js.native
  
  /**
    * Removes all classes from the current element.
    */
  def removeAllClasses(): IChartistSvg = js.native
  
  /**
    * Removes one or a space separated list of classes from the current element.
    *
    * @method removeClass
    * @param names {string} A white space separated list of class names
    */
  def removeClass(names: String): IChartistSvg = js.native
  
  /**
    * This method will replace the element with a new element that can be created outside of the current DOM.
    */
  def replace(): IChartistSvg = js.native
  
  /**
    * This method returns a Chartist.Svg wrapper around the root SVG element of the current tree.
    */
  def root(): IChartistSvg = js.native
  
  /**
    * This method adds a new text element to the current Chartist.Svg wrapper.
    */
  def text(t: String): IChartistSvg = js.native
}
