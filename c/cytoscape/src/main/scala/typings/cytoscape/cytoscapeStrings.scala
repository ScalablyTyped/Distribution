package typings.cytoscape

import typings.cytoscape.mod.CollectionEventName
import typings.cytoscape.mod.Css.ArrowFill
import typings.cytoscape.mod.Css.ArrowShape
import typings.cytoscape.mod.Css.FontStyle
import typings.cytoscape.mod.Css.LineStyle
import typings.cytoscape.mod.Css.NodeShape
import typings.cytoscape.mod.Css.TextTranformation
import typings.cytoscape.mod.Css.TransitionTimingFunction
import typings.cytoscape.mod.Css._FontWeight
import typings.cytoscape.mod.ElementGroup
import typings.cytoscape.mod.GraphEventName
import typings.cytoscape.mod.PositionDimension
import typings.cytoscape.mod.SelectionType
import typings.cytoscape.mod.UserInputDeviceEventName
import typings.cytoscape.mod.UserInputDeviceEventNameExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cytoscapeStrings {
  @js.native
  sealed trait add extends CollectionEventName
  
  @js.native
  sealed trait additive extends SelectionType
  
  @js.native
  sealed trait auto extends js.Object
  
  @js.native
  sealed trait base64 extends js.Object
  
  @js.native
  sealed trait base64uri extends js.Object
  
  @js.native
  sealed trait bezier extends js.Object
  
  @js.native
  sealed trait blob extends js.Object
  
  @js.native
  sealed trait bold extends _FontWeight
  
  @js.native
  sealed trait bolder extends _FontWeight
  
  @js.native
  sealed trait bottom extends js.Object
  
  @js.native
  sealed trait box extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait boxend extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait boxselect extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait boxstart extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait breadthfirst extends js.Object
  
  @js.native
  sealed trait butt extends js.Object
  
  @js.native
  sealed trait center extends js.Object
  
  @js.native
  sealed trait chevron extends ArrowShape
  
  @js.native
  sealed trait circle extends ArrowShape
  
  @js.native
  sealed trait click extends UserInputDeviceEventName
  
  @js.native
  sealed trait clipped extends js.Object
  
  @js.native
  sealed trait complete extends js.Object
  
  @js.native
  sealed trait completed extends js.Object
  
  @js.native
  sealed trait concentric extends js.Object
  
  @js.native
  sealed trait contain extends js.Object
  
  @js.native
  sealed trait cose extends js.Object
  
  @js.native
  sealed trait cover extends js.Object
  
  @js.native
  sealed trait `cubic-bezier` extends TransitionTimingFunction
  
  @js.native
  sealed trait cxtdrag extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait cxtdragout extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait cxtdragover extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait cxttap extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait cxttapend extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait cxttapstart extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait dashed extends LineStyle
  
  @js.native
  sealed trait data extends CollectionEventName
  
  @js.native
  sealed trait destroy extends GraphEventName
  
  @js.native
  sealed trait diamond
    extends ArrowShape
       with NodeShape
  
  @js.native
  sealed trait displayed extends js.Object
  
  @js.native
  sealed trait dotted extends LineStyle
  
  @js.native
  sealed trait double extends LineStyle
  
  @js.native
  sealed trait drag extends CollectionEventName
  
  @js.native
  sealed trait ease extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-in` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-in-circ` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-in-cubic` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-in-expo` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-in-out` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-in-out-circ` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-in-out-cubic` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-in-out-expo` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-in-out-quad` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-in-out-quart` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-in-out-quint` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-in-out-sine` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-in-quad` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-in-quart` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-in-quint` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-in-sine` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-out` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-out-circ` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-out-cubic` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-out-expo` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-out-quad` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-out-quart` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-out-quint` extends TransitionTimingFunction
  
  @js.native
  sealed trait `ease-out-sine` extends TransitionTimingFunction
  
  @js.native
  sealed trait edges extends ElementGroup
  
  @js.native
  sealed trait ellipse extends NodeShape
  
  @js.native
  sealed trait ellipsis extends js.Object
  
  @js.native
  sealed trait filled extends ArrowFill
  
  @js.native
  sealed trait frame extends js.Object
  
  @js.native
  sealed trait free extends CollectionEventName
  
  @js.native
  sealed trait grab extends CollectionEventName
  
  @js.native
  sealed trait grabon extends CollectionEventName
  
  @js.native
  sealed trait grid extends js.Object
  
  @js.native
  sealed trait haystack extends js.Object
  
  @js.native
  sealed trait heptagon extends NodeShape
  
  @js.native
  sealed trait hexagon extends NodeShape
  
  @js.native
  sealed trait hollow extends ArrowFill
  
  @js.native
  sealed trait intersection extends js.Object
  
  @js.native
  sealed trait italic extends FontStyle
  
  @js.native
  sealed trait layoutready extends GraphEventName
  
  @js.native
  sealed trait layoutstart extends GraphEventName
  
  @js.native
  sealed trait layoutstop extends GraphEventName
  
  @js.native
  sealed trait left extends js.Object
  
  @js.native
  sealed trait lighter extends _FontWeight
  
  @js.native
  sealed trait linear extends TransitionTimingFunction
  
  @js.native
  sealed trait `linear-gradient` extends js.Object
  
  @js.native
  sealed trait lock extends CollectionEventName
  
  @js.native
  sealed trait lowercase extends TextTranformation
  
  @js.native
  sealed trait mousedown extends UserInputDeviceEventName
  
  @js.native
  sealed trait mousemove extends UserInputDeviceEventName
  
  @js.native
  sealed trait mouseout extends UserInputDeviceEventName
  
  @js.native
  sealed trait mouseover extends UserInputDeviceEventName
  
  @js.native
  sealed trait mouseup extends UserInputDeviceEventName
  
  @js.native
  sealed trait no extends js.Object
  
  @js.native
  sealed trait `no-repeat` extends js.Object
  
  @js.native
  sealed trait `node-position` extends js.Object
  
  @js.native
  sealed trait nodes extends ElementGroup
  
  @js.native
  sealed trait none
    extends ArrowShape
       with TextTranformation
  
  @js.native
  sealed trait normal
    extends FontStyle
       with _FontWeight
  
  @js.native
  sealed trait `null` extends js.Object
  
  @js.native
  sealed trait oblique extends FontStyle
  
  @js.native
  sealed trait octagon extends NodeShape
  
  @js.native
  sealed trait pan extends GraphEventName
  
  @js.native
  sealed trait pentagon extends NodeShape
  
  @js.native
  sealed trait polygon extends NodeShape
  
  @js.native
  sealed trait position extends CollectionEventName
  
  @js.native
  sealed trait preset extends js.Object
  
  @js.native
  sealed trait `radial-gradient` extends js.Object
  
  @js.native
  sealed trait random extends js.Object
  
  @js.native
  sealed trait ready extends GraphEventName
  
  @js.native
  sealed trait rectangle extends NodeShape
  
  @js.native
  sealed trait remove extends CollectionEventName
  
  @js.native
  sealed trait render extends GraphEventName
  
  @js.native
  sealed trait repeat extends js.Object
  
  @js.native
  sealed trait `repeat-x` extends js.Object
  
  @js.native
  sealed trait `repeat-y` extends js.Object
  
  @js.native
  sealed trait resize extends GraphEventName
  
  @js.native
  sealed trait rhomboid extends NodeShape
  
  @js.native
  sealed trait right extends js.Object
  
  @js.native
  sealed trait round extends js.Object
  
  @js.native
  sealed trait `round-diamond` extends NodeShape
  
  @js.native
  sealed trait `round-heptagon` extends NodeShape
  
  @js.native
  sealed trait `round-hexagon` extends NodeShape
  
  @js.native
  sealed trait `round-octagon` extends NodeShape
  
  @js.native
  sealed trait `round-pentagon` extends NodeShape
  
  @js.native
  sealed trait `round-rectangle` extends NodeShape
  
  @js.native
  sealed trait `round-tag` extends NodeShape
  
  @js.native
  sealed trait `round-triangle` extends NodeShape
  
  @js.native
  sealed trait roundrectangle extends NodeShape
  
  @js.native
  sealed trait scratch extends CollectionEventName
  
  @js.native
  sealed trait segments extends js.Object
  
  @js.native
  sealed trait select extends CollectionEventName
  
  @js.native
  sealed trait single extends SelectionType
  
  @js.native
  sealed trait solid extends LineStyle
  
  @js.native
  sealed trait spring extends TransitionTimingFunction
  
  @js.native
  sealed trait square extends ArrowShape
  
  @js.native
  sealed trait star extends NodeShape
  
  @js.native
  sealed trait straight extends js.Object
  
  @js.native
  sealed trait style extends CollectionEventName
  
  @js.native
  sealed trait tap extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait tapdrag extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait tapdragout extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait tapdragover extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait tapend extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait taphold extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait tapstart extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait taxi extends js.Object
  
  @js.native
  sealed trait tee extends ArrowShape
  
  @js.native
  sealed trait top extends js.Object
  
  @js.native
  sealed trait touchend extends UserInputDeviceEventName
  
  @js.native
  sealed trait touchmove extends UserInputDeviceEventName
  
  @js.native
  sealed trait touchstart extends UserInputDeviceEventName
  
  @js.native
  sealed trait triangle
    extends ArrowShape
       with NodeShape
  
  @js.native
  sealed trait `triangle-backcurve` extends ArrowShape
  
  @js.native
  sealed trait `triangle-cross` extends ArrowShape
  
  @js.native
  sealed trait `triangle-tee` extends ArrowShape
  
  @js.native
  sealed trait `unbundled-bezier` extends js.Object
  
  @js.native
  sealed trait unlock extends CollectionEventName
  
  @js.native
  sealed trait unselect extends CollectionEventName
  
  @js.native
  sealed trait uppercase extends TextTranformation
  
  @js.native
  sealed trait vclick extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait vee
    extends ArrowShape
       with NodeShape
  
  @js.native
  sealed trait visible extends js.Object
  
  @js.native
  sealed trait vmousedown extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait vmousemove extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait vmouseup extends UserInputDeviceEventNameExt
  
  @js.native
  sealed trait wrap extends js.Object
  
  @js.native
  sealed trait x extends PositionDimension
  
  @js.native
  sealed trait y extends PositionDimension
  
  @js.native
  sealed trait yes extends js.Object
  
  @js.native
  sealed trait zoom extends GraphEventName
  
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  @scala.inline
  def additive: additive = "additive".asInstanceOf[additive]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def base64uri: base64uri = "base64uri".asInstanceOf[base64uri]
  @scala.inline
  def bezier: bezier = "bezier".asInstanceOf[bezier]
  @scala.inline
  def blob: blob = "blob".asInstanceOf[blob]
  @scala.inline
  def bold: bold = "bold".asInstanceOf[bold]
  @scala.inline
  def bolder: bolder = "bolder".asInstanceOf[bolder]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def box: box = "box".asInstanceOf[box]
  @scala.inline
  def boxend: boxend = "boxend".asInstanceOf[boxend]
  @scala.inline
  def boxselect: boxselect = "boxselect".asInstanceOf[boxselect]
  @scala.inline
  def boxstart: boxstart = "boxstart".asInstanceOf[boxstart]
  @scala.inline
  def breadthfirst: breadthfirst = "breadthfirst".asInstanceOf[breadthfirst]
  @scala.inline
  def butt: butt = "butt".asInstanceOf[butt]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def chevron: chevron = "chevron".asInstanceOf[chevron]
  @scala.inline
  def circle: circle = "circle".asInstanceOf[circle]
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  @scala.inline
  def clipped: clipped = "clipped".asInstanceOf[clipped]
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  @scala.inline
  def completed: completed = "completed".asInstanceOf[completed]
  @scala.inline
  def concentric: concentric = "concentric".asInstanceOf[concentric]
  @scala.inline
  def contain: contain = "contain".asInstanceOf[contain]
  @scala.inline
  def cose: cose = "cose".asInstanceOf[cose]
  @scala.inline
  def cover: cover = "cover".asInstanceOf[cover]
  @scala.inline
  def `cubic-bezier`: `cubic-bezier` = "cubic-bezier".asInstanceOf[`cubic-bezier`]
  @scala.inline
  def cxtdrag: cxtdrag = "cxtdrag".asInstanceOf[cxtdrag]
  @scala.inline
  def cxtdragout: cxtdragout = "cxtdragout".asInstanceOf[cxtdragout]
  @scala.inline
  def cxtdragover: cxtdragover = "cxtdragover".asInstanceOf[cxtdragover]
  @scala.inline
  def cxttap: cxttap = "cxttap".asInstanceOf[cxttap]
  @scala.inline
  def cxttapend: cxttapend = "cxttapend".asInstanceOf[cxttapend]
  @scala.inline
  def cxttapstart: cxttapstart = "cxttapstart".asInstanceOf[cxttapstart]
  @scala.inline
  def dashed: dashed = "dashed".asInstanceOf[dashed]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  @scala.inline
  def diamond: diamond = "diamond".asInstanceOf[diamond]
  @scala.inline
  def displayed: displayed = "displayed".asInstanceOf[displayed]
  @scala.inline
  def dotted: dotted = "dotted".asInstanceOf[dotted]
  @scala.inline
  def double: double = "double".asInstanceOf[double]
  @scala.inline
  def drag: drag = "drag".asInstanceOf[drag]
  @scala.inline
  def ease: ease = "ease".asInstanceOf[ease]
  @scala.inline
  def `ease-in`: `ease-in` = "ease-in".asInstanceOf[`ease-in`]
  @scala.inline
  def `ease-in-circ`: `ease-in-circ` = "ease-in-circ".asInstanceOf[`ease-in-circ`]
  @scala.inline
  def `ease-in-cubic`: `ease-in-cubic` = "ease-in-cubic".asInstanceOf[`ease-in-cubic`]
  @scala.inline
  def `ease-in-expo`: `ease-in-expo` = "ease-in-expo".asInstanceOf[`ease-in-expo`]
  @scala.inline
  def `ease-in-out`: `ease-in-out` = "ease-in-out".asInstanceOf[`ease-in-out`]
  @scala.inline
  def `ease-in-out-circ`: `ease-in-out-circ` = "ease-in-out-circ".asInstanceOf[`ease-in-out-circ`]
  @scala.inline
  def `ease-in-out-cubic`: `ease-in-out-cubic` = "ease-in-out-cubic".asInstanceOf[`ease-in-out-cubic`]
  @scala.inline
  def `ease-in-out-expo`: `ease-in-out-expo` = "ease-in-out-expo".asInstanceOf[`ease-in-out-expo`]
  @scala.inline
  def `ease-in-out-quad`: `ease-in-out-quad` = "ease-in-out-quad".asInstanceOf[`ease-in-out-quad`]
  @scala.inline
  def `ease-in-out-quart`: `ease-in-out-quart` = "ease-in-out-quart".asInstanceOf[`ease-in-out-quart`]
  @scala.inline
  def `ease-in-out-quint`: `ease-in-out-quint` = "ease-in-out-quint".asInstanceOf[`ease-in-out-quint`]
  @scala.inline
  def `ease-in-out-sine`: `ease-in-out-sine` = "ease-in-out-sine".asInstanceOf[`ease-in-out-sine`]
  @scala.inline
  def `ease-in-quad`: `ease-in-quad` = "ease-in-quad".asInstanceOf[`ease-in-quad`]
  @scala.inline
  def `ease-in-quart`: `ease-in-quart` = "ease-in-quart".asInstanceOf[`ease-in-quart`]
  @scala.inline
  def `ease-in-quint`: `ease-in-quint` = "ease-in-quint".asInstanceOf[`ease-in-quint`]
  @scala.inline
  def `ease-in-sine`: `ease-in-sine` = "ease-in-sine".asInstanceOf[`ease-in-sine`]
  @scala.inline
  def `ease-out`: `ease-out` = "ease-out".asInstanceOf[`ease-out`]
  @scala.inline
  def `ease-out-circ`: `ease-out-circ` = "ease-out-circ".asInstanceOf[`ease-out-circ`]
  @scala.inline
  def `ease-out-cubic`: `ease-out-cubic` = "ease-out-cubic".asInstanceOf[`ease-out-cubic`]
  @scala.inline
  def `ease-out-expo`: `ease-out-expo` = "ease-out-expo".asInstanceOf[`ease-out-expo`]
  @scala.inline
  def `ease-out-quad`: `ease-out-quad` = "ease-out-quad".asInstanceOf[`ease-out-quad`]
  @scala.inline
  def `ease-out-quart`: `ease-out-quart` = "ease-out-quart".asInstanceOf[`ease-out-quart`]
  @scala.inline
  def `ease-out-quint`: `ease-out-quint` = "ease-out-quint".asInstanceOf[`ease-out-quint`]
  @scala.inline
  def `ease-out-sine`: `ease-out-sine` = "ease-out-sine".asInstanceOf[`ease-out-sine`]
  @scala.inline
  def edges: edges = "edges".asInstanceOf[edges]
  @scala.inline
  def ellipse: ellipse = "ellipse".asInstanceOf[ellipse]
  @scala.inline
  def ellipsis: ellipsis = "ellipsis".asInstanceOf[ellipsis]
  @scala.inline
  def filled: filled = "filled".asInstanceOf[filled]
  @scala.inline
  def frame: frame = "frame".asInstanceOf[frame]
  @scala.inline
  def free: free = "free".asInstanceOf[free]
  @scala.inline
  def grab: grab = "grab".asInstanceOf[grab]
  @scala.inline
  def grabon: grabon = "grabon".asInstanceOf[grabon]
  @scala.inline
  def grid: grid = "grid".asInstanceOf[grid]
  @scala.inline
  def haystack: haystack = "haystack".asInstanceOf[haystack]
  @scala.inline
  def heptagon: heptagon = "heptagon".asInstanceOf[heptagon]
  @scala.inline
  def hexagon: hexagon = "hexagon".asInstanceOf[hexagon]
  @scala.inline
  def hollow: hollow = "hollow".asInstanceOf[hollow]
  @scala.inline
  def intersection: intersection = "intersection".asInstanceOf[intersection]
  @scala.inline
  def italic: italic = "italic".asInstanceOf[italic]
  @scala.inline
  def layoutready: layoutready = "layoutready".asInstanceOf[layoutready]
  @scala.inline
  def layoutstart: layoutstart = "layoutstart".asInstanceOf[layoutstart]
  @scala.inline
  def layoutstop: layoutstop = "layoutstop".asInstanceOf[layoutstop]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def lighter: lighter = "lighter".asInstanceOf[lighter]
  @scala.inline
  def linear: linear = "linear".asInstanceOf[linear]
  @scala.inline
  def `linear-gradient`: `linear-gradient` = "linear-gradient".asInstanceOf[`linear-gradient`]
  @scala.inline
  def lock: lock = "lock".asInstanceOf[lock]
  @scala.inline
  def lowercase: lowercase = "lowercase".asInstanceOf[lowercase]
  @scala.inline
  def mousedown: mousedown = "mousedown".asInstanceOf[mousedown]
  @scala.inline
  def mousemove: mousemove = "mousemove".asInstanceOf[mousemove]
  @scala.inline
  def mouseout: mouseout = "mouseout".asInstanceOf[mouseout]
  @scala.inline
  def mouseover: mouseover = "mouseover".asInstanceOf[mouseover]
  @scala.inline
  def mouseup: mouseup = "mouseup".asInstanceOf[mouseup]
  @scala.inline
  def no: no = "no".asInstanceOf[no]
  @scala.inline
  def `no-repeat`: `no-repeat` = "no-repeat".asInstanceOf[`no-repeat`]
  @scala.inline
  def `node-position`: `node-position` = "node-position".asInstanceOf[`node-position`]
  @scala.inline
  def nodes: nodes = "nodes".asInstanceOf[nodes]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  @scala.inline
  def `null`: `null` = "null".asInstanceOf[`null`]
  @scala.inline
  def oblique: oblique = "oblique".asInstanceOf[oblique]
  @scala.inline
  def octagon: octagon = "octagon".asInstanceOf[octagon]
  @scala.inline
  def pan: pan = "pan".asInstanceOf[pan]
  @scala.inline
  def pentagon: pentagon = "pentagon".asInstanceOf[pentagon]
  @scala.inline
  def polygon: polygon = "polygon".asInstanceOf[polygon]
  @scala.inline
  def position: position = "position".asInstanceOf[position]
  @scala.inline
  def preset: preset = "preset".asInstanceOf[preset]
  @scala.inline
  def `radial-gradient`: `radial-gradient` = "radial-gradient".asInstanceOf[`radial-gradient`]
  @scala.inline
  def random: random = "random".asInstanceOf[random]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def rectangle: rectangle = "rectangle".asInstanceOf[rectangle]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  @scala.inline
  def render: render = "render".asInstanceOf[render]
  @scala.inline
  def repeat: repeat = "repeat".asInstanceOf[repeat]
  @scala.inline
  def `repeat-x`: `repeat-x` = "repeat-x".asInstanceOf[`repeat-x`]
  @scala.inline
  def `repeat-y`: `repeat-y` = "repeat-y".asInstanceOf[`repeat-y`]
  @scala.inline
  def resize: resize = "resize".asInstanceOf[resize]
  @scala.inline
  def rhomboid: rhomboid = "rhomboid".asInstanceOf[rhomboid]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def round: round = "round".asInstanceOf[round]
  @scala.inline
  def `round-diamond`: `round-diamond` = "round-diamond".asInstanceOf[`round-diamond`]
  @scala.inline
  def `round-heptagon`: `round-heptagon` = "round-heptagon".asInstanceOf[`round-heptagon`]
  @scala.inline
  def `round-hexagon`: `round-hexagon` = "round-hexagon".asInstanceOf[`round-hexagon`]
  @scala.inline
  def `round-octagon`: `round-octagon` = "round-octagon".asInstanceOf[`round-octagon`]
  @scala.inline
  def `round-pentagon`: `round-pentagon` = "round-pentagon".asInstanceOf[`round-pentagon`]
  @scala.inline
  def `round-rectangle`: `round-rectangle` = "round-rectangle".asInstanceOf[`round-rectangle`]
  @scala.inline
  def `round-tag`: `round-tag` = "round-tag".asInstanceOf[`round-tag`]
  @scala.inline
  def `round-triangle`: `round-triangle` = "round-triangle".asInstanceOf[`round-triangle`]
  @scala.inline
  def roundrectangle: roundrectangle = "roundrectangle".asInstanceOf[roundrectangle]
  @scala.inline
  def scratch: scratch = "scratch".asInstanceOf[scratch]
  @scala.inline
  def segments: segments = "segments".asInstanceOf[segments]
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  @scala.inline
  def single: single = "single".asInstanceOf[single]
  @scala.inline
  def solid: solid = "solid".asInstanceOf[solid]
  @scala.inline
  def spring: spring = "spring".asInstanceOf[spring]
  @scala.inline
  def square: square = "square".asInstanceOf[square]
  @scala.inline
  def star: star = "star".asInstanceOf[star]
  @scala.inline
  def straight: straight = "straight".asInstanceOf[straight]
  @scala.inline
  def style: style = "style".asInstanceOf[style]
  @scala.inline
  def tap: tap = "tap".asInstanceOf[tap]
  @scala.inline
  def tapdrag: tapdrag = "tapdrag".asInstanceOf[tapdrag]
  @scala.inline
  def tapdragout: tapdragout = "tapdragout".asInstanceOf[tapdragout]
  @scala.inline
  def tapdragover: tapdragover = "tapdragover".asInstanceOf[tapdragover]
  @scala.inline
  def tapend: tapend = "tapend".asInstanceOf[tapend]
  @scala.inline
  def taphold: taphold = "taphold".asInstanceOf[taphold]
  @scala.inline
  def tapstart: tapstart = "tapstart".asInstanceOf[tapstart]
  @scala.inline
  def taxi: taxi = "taxi".asInstanceOf[taxi]
  @scala.inline
  def tee: tee = "tee".asInstanceOf[tee]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def touchend: touchend = "touchend".asInstanceOf[touchend]
  @scala.inline
  def touchmove: touchmove = "touchmove".asInstanceOf[touchmove]
  @scala.inline
  def touchstart: touchstart = "touchstart".asInstanceOf[touchstart]
  @scala.inline
  def triangle: triangle = "triangle".asInstanceOf[triangle]
  @scala.inline
  def `triangle-backcurve`: `triangle-backcurve` = "triangle-backcurve".asInstanceOf[`triangle-backcurve`]
  @scala.inline
  def `triangle-cross`: `triangle-cross` = "triangle-cross".asInstanceOf[`triangle-cross`]
  @scala.inline
  def `triangle-tee`: `triangle-tee` = "triangle-tee".asInstanceOf[`triangle-tee`]
  @scala.inline
  def `unbundled-bezier`: `unbundled-bezier` = "unbundled-bezier".asInstanceOf[`unbundled-bezier`]
  @scala.inline
  def unlock: unlock = "unlock".asInstanceOf[unlock]
  @scala.inline
  def unselect: unselect = "unselect".asInstanceOf[unselect]
  @scala.inline
  def uppercase: uppercase = "uppercase".asInstanceOf[uppercase]
  @scala.inline
  def vclick: vclick = "vclick".asInstanceOf[vclick]
  @scala.inline
  def vee: vee = "vee".asInstanceOf[vee]
  @scala.inline
  def visible: visible = "visible".asInstanceOf[visible]
  @scala.inline
  def vmousedown: vmousedown = "vmousedown".asInstanceOf[vmousedown]
  @scala.inline
  def vmousemove: vmousemove = "vmousemove".asInstanceOf[vmousemove]
  @scala.inline
  def vmouseup: vmouseup = "vmouseup".asInstanceOf[vmouseup]
  @scala.inline
  def wrap: wrap = "wrap".asInstanceOf[wrap]
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  @scala.inline
  def y: y = "y".asInstanceOf[y]
  @scala.inline
  def yes: yes = "yes".asInstanceOf[yes]
  @scala.inline
  def zoom: zoom = "zoom".asInstanceOf[zoom]
}

