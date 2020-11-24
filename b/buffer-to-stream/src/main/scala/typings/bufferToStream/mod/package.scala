package typings.bufferToStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ToStream = js.Function2[
    /* buffer */ java.lang.String | typings.node.Buffer, 
    /* chunkSize */ js.UndefOr[scala.Double], 
    typings.node.streamMod.Readable
  ]
}
