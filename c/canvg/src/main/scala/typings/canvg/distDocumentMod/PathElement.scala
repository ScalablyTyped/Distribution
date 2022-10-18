package typings.canvg.distDocumentMod

import typings.canvg.anon.A1
import typings.canvg.anon.ControlPoint
import typings.canvg.anon.Current
import typings.canvg.anon.CurrentPoint
import typings.canvg.anon.Point
import typings.canvg.distPathParserMod.PathParser
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvg/dist/Document", "PathElement")
@js.native
open class PathElement protected ()
  extends typings.canvg.distDocumentElementsMod.PathElement {
  def this(document: typings.canvg.distDocumentDocumentMod.Document) = this()
  def this(document: typings.canvg.distDocumentDocumentMod.Document, node: HTMLElement) = this()
  def this(document: typings.canvg.distDocumentDocumentMod.Document, node: Unit, captureTextNodes: Boolean) = this()
  def this(
    document: typings.canvg.distDocumentDocumentMod.Document,
    node: HTMLElement,
    captureTextNodes: Boolean
  ) = this()
}
/* static members */
object PathElement {
  
  @JSImport("canvg/dist/Document", "PathElement")
  @js.native
  val ^ : js.Any = js.native
  
  inline def pathA(pathParser: PathParser): A1 = ^.asInstanceOf[js.Dynamic].applyDynamic("pathA")(pathParser.asInstanceOf[js.Any]).asInstanceOf[A1]
  
  inline def pathC(pathParser: PathParser): ControlPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("pathC")(pathParser.asInstanceOf[js.Any]).asInstanceOf[ControlPoint]
  
  inline def pathH(pathParser: PathParser): Current = ^.asInstanceOf[js.Dynamic].applyDynamic("pathH")(pathParser.asInstanceOf[js.Any]).asInstanceOf[Current]
  
  inline def pathL(pathParser: PathParser): Current = ^.asInstanceOf[js.Dynamic].applyDynamic("pathL")(pathParser.asInstanceOf[js.Any]).asInstanceOf[Current]
  
  inline def pathM(pathParser: PathParser): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("pathM")(pathParser.asInstanceOf[js.Any]).asInstanceOf[Point]
  
  inline def pathQ(pathParser: PathParser): CurrentPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("pathQ")(pathParser.asInstanceOf[js.Any]).asInstanceOf[CurrentPoint]
  
  inline def pathS(pathParser: PathParser): ControlPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("pathS")(pathParser.asInstanceOf[js.Any]).asInstanceOf[ControlPoint]
  
  inline def pathT(pathParser: PathParser): CurrentPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("pathT")(pathParser.asInstanceOf[js.Any]).asInstanceOf[CurrentPoint]
  
  inline def pathV(pathParser: PathParser): Current = ^.asInstanceOf[js.Dynamic].applyDynamic("pathV")(pathParser.asInstanceOf[js.Any]).asInstanceOf[Current]
  
  inline def pathZ(pathParser: PathParser): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pathZ")(pathParser.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
