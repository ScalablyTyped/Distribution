package typings.codemirror.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionConstructor
  extends StObject
     with Instantiable1[/* line */ Double, Position]
     with Instantiable2[/* line */ Double, /* ch */ Double, Position]
     with Instantiable3[/* line */ Double, (/* ch */ Double) | (/* ch */ Unit), /* sticky */ String, Position] {
  
  def apply(line: Double): Position = js.native
  def apply(line: Double, ch: Double): Position = js.native
  def apply(line: Double, ch: Double, sticky: String): Position = js.native
  def apply(line: Double, ch: Unit, sticky: String): Position = js.native
}
