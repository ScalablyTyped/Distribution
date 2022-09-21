package typings.canvg.mod

import typings.canvg.anon.A1
import typings.canvg.anon.ControlPoint
import typings.canvg.anon.Current
import typings.canvg.anon.CurrentPoint
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvg", "PathElement")
@js.native
open class PathElement protected ()
  extends typings.canvg.documentMod.PathElement {
  def this(document: typings.canvg.documentDocumentMod.Document) = this()
  def this(document: typings.canvg.documentDocumentMod.Document, node: HTMLElement) = this()
  def this(document: typings.canvg.documentDocumentMod.Document, node: Unit, captureTextNodes: Boolean) = this()
  def this(document: typings.canvg.documentDocumentMod.Document, node: HTMLElement, captureTextNodes: Boolean) = this()
}
/* static members */
object PathElement {
  
  @JSImport("canvg", "PathElement")
  @js.native
  val ^ : js.Any = js.native
  
  inline def pathA(pathParser: typings.canvg.pathParserMod.PathParser): A1 = ^.asInstanceOf[js.Dynamic].applyDynamic("pathA")(pathParser.asInstanceOf[js.Any]).asInstanceOf[A1]
  
  inline def pathC(pathParser: typings.canvg.pathParserMod.PathParser): ControlPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("pathC")(pathParser.asInstanceOf[js.Any]).asInstanceOf[ControlPoint]
  
  inline def pathH(pathParser: typings.canvg.pathParserMod.PathParser): Current = ^.asInstanceOf[js.Dynamic].applyDynamic("pathH")(pathParser.asInstanceOf[js.Any]).asInstanceOf[Current]
  
  inline def pathL(pathParser: typings.canvg.pathParserMod.PathParser): Current = ^.asInstanceOf[js.Dynamic].applyDynamic("pathL")(pathParser.asInstanceOf[js.Any]).asInstanceOf[Current]
  
  inline def pathM(pathParser: typings.canvg.pathParserMod.PathParser): typings.canvg.anon.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("pathM")(pathParser.asInstanceOf[js.Any]).asInstanceOf[typings.canvg.anon.Point]
  
  inline def pathQ(pathParser: typings.canvg.pathParserMod.PathParser): CurrentPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("pathQ")(pathParser.asInstanceOf[js.Any]).asInstanceOf[CurrentPoint]
  
  inline def pathS(pathParser: typings.canvg.pathParserMod.PathParser): ControlPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("pathS")(pathParser.asInstanceOf[js.Any]).asInstanceOf[ControlPoint]
  
  inline def pathT(pathParser: typings.canvg.pathParserMod.PathParser): CurrentPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("pathT")(pathParser.asInstanceOf[js.Any]).asInstanceOf[CurrentPoint]
  
  inline def pathV(pathParser: typings.canvg.pathParserMod.PathParser): Current = ^.asInstanceOf[js.Dynamic].applyDynamic("pathV")(pathParser.asInstanceOf[js.Any]).asInstanceOf[Current]
  
  inline def pathZ(pathParser: typings.canvg.pathParserMod.PathParser): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pathZ")(pathParser.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
