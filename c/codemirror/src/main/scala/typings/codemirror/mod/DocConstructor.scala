package typings.codemirror.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocConstructor
  extends Instantiable1[/* text */ String, typings.codemirror.mod.Doc]
     with Instantiable2[/* text */ String, /* mode */ js.Any, typings.codemirror.mod.Doc]
     with Instantiable3[
      /* text */ String, 
      js.UndefOr[/* mode */ js.Any], 
      /* firstLineNumber */ Double, 
      typings.codemirror.mod.Doc
    ]
     with Instantiable4[
      /* text */ String, 
      js.UndefOr[/* mode */ js.Any], 
      js.UndefOr[/* firstLineNumber */ Double], 
      /* lineSep */ String, 
      typings.codemirror.mod.Doc
    ] {
  
  def apply(text: String): typings.codemirror.mod.Doc = js.native
  def apply(
    text: String,
    mode: js.UndefOr[scala.Nothing],
    firstLineNumber: js.UndefOr[scala.Nothing],
    lineSep: String
  ): typings.codemirror.mod.Doc = js.native
  def apply(text: String, mode: js.UndefOr[scala.Nothing], firstLineNumber: Double): typings.codemirror.mod.Doc = js.native
  def apply(text: String, mode: js.UndefOr[scala.Nothing], firstLineNumber: Double, lineSep: String): typings.codemirror.mod.Doc = js.native
  def apply(text: String, mode: js.Any): typings.codemirror.mod.Doc = js.native
  def apply(text: String, mode: js.Any, firstLineNumber: js.UndefOr[scala.Nothing], lineSep: String): typings.codemirror.mod.Doc = js.native
  def apply(text: String, mode: js.Any, firstLineNumber: Double): typings.codemirror.mod.Doc = js.native
  def apply(text: String, mode: js.Any, firstLineNumber: Double, lineSep: String): typings.codemirror.mod.Doc = js.native
}
