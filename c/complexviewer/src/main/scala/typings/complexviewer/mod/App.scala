package typings.complexviewer.mod

import typings.complexviewer.anon.DRAGGING
import typings.complexviewer.mod.^
import typings.d3Scale.mod.ScaleOrdinal_
import typings.std.HTMLElement
import typings.std.Map
import typings.std.SVGElement
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App extends StObject {
  
  var STATES: DRAGGING = js.native
  
  def addExpandListener(expandListener: ExpandListener): Unit = js.native
  
  def addHoverListener(hoverListener: HoverListener): Unit = js.native
  
  var annotationSetsShown: Map[String, Boolean] = js.native
  
  def autoLayout(): Unit = js.native
  
  var barScales: js.Array[Double] = js.native
  
  var certainCategories: Set[String] = js.native
  
  def checkLinks(): Unit = js.native
  
  def clear(): Unit = js.native
  
  /**
    * Triggers {@link ExpandListener}
    */
  def collapseAll(): Unit = js.native
  
  def collapseProtein(): Unit = js.native
  
  var complexes: js.Array[Complex] = js.native
  
  var defs: HTMLElement = js.native
  
  def downloadSVG(fileName: String): Unit = js.native
  
  /**
    * Triggers {@link ExpandListener}
    */
  def expandAll(): Unit = js.native
  
  /**
    * Triggers {@link ExpandListener}
    * @param moleculeSelected
    */
  def expandAndCollapseSelection(moleculeSelected: js.Array[String]): Unit = js.native
  
  var expandListeners: js.Array[ExpandListener] = js.native
  
  /**
    * Given a value in the input domain, returns the corresponding value in the output range.
    * If the given value is not in the scale’s domain, returns the unknown; or, if the unknown value is implicit (the default),
    * then the value is implicitly added to the domain and the next-available value in the range is assigned to value,
    * such that this and subsequent invocations of the scale given the same input value return the same output value.
    *
    * @param x A value from the domain.
    */
  def featureColors(x: String): String | scala.Nothing = js.native
  @JSName("featureColors")
  var featureColors_Original: ScaleOrdinal_[String, String, scala.Nothing] = js.native
  
  var features: Map[String, Feature] = js.native
  
  def getColorKeyJson(): ColorKey = js.native
  
  def getExpandedParticipants(): js.Array[Any] = js.native
  
  def getSVG(): String = js.native
  
  def hideTooltip(): Unit = js.native
  
  var hoverListeners: js.Array[HoverListener] = js.native
  
  def init(): Unit = js.native
  
  var interactors: Map[String, Interactor] = js.native
  
  def notifyExpandListener(): Unit = js.native
  
  def notifyHoverListener(): Unit = js.native
  
  var participants: Map[String, Participant] = js.native
  
  def readMIJSON(miJson: MIJson, expand: Boolean): Unit = js.native
  
  def removeExpandListener(expandListener: ExpandListener): Unit = js.native
  
  def removeHoverListener(hoverListener: HoverListener): Unit = js.native
  
  def setAllLinkCoordinates(): Unit = js.native
  
  /**
    * @deprecated Use {@link showAnnotations} instead
    * @param annoChoice
    */
  def setAnnotations(annoChoice: String): ColorKey = js.native
  
  def setTooltip(text: Any): Unit = js.native
  def setTooltip(text: Any, color: String): Unit = js.native
  
  def showAnnotations(annoChoice: String, show: Boolean): ColorKey = js.native
  
  def showTooltip(p: Point): Unit = js.native
  
  var tooltip: SVGElement = js.native
  
  var tooltip_bg: SVGElement = js.native
  
  var tooltip_subBg: SVGElement = js.native
  
  var uncertainCategories: Set[String] = js.native
  
  def updateAnnotations(): Unit = js.native
  
  def zoomToExtent(): Unit = js.native
}
object App {
  
  inline def apply: AppConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("App").asInstanceOf[AppConstructor]
}
