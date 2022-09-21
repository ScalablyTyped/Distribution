package typings.chromeLauncher.anon

import typings.chromeLauncher.chromeLauncherStrings.buffer
import typings.node.anon.`2`
import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.EncodingOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofmkdtemp extends StObject {
  
  def apply(
    prefix: String,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* folder */ String, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: buffer,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* folder */ Buffer, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: `2`,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* folder */ Buffer, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: EncodingOption,
    callback: js.Function2[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      Buffer | (/* folder */ String), 
      Unit
    ]
  ): Unit = js.native
}
