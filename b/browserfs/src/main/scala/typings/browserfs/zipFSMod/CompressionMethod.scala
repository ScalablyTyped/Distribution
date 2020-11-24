package typings.browserfs.zipFSMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompressionMethod extends js.Object
@JSImport("browserfs/dist/node/backend/ZipFS", "CompressionMethod")
@js.native
object CompressionMethod extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompressionMethod with Double] = js.native
  
  @js.native
  sealed trait BZIP2 extends CompressionMethod
  /* 12 */ @js.native
  object BZIP2 extends TopLevel[BZIP2 with Double]
  
  @js.native
  sealed trait DEFLATE extends CompressionMethod
  /* 8 */ @js.native
  object DEFLATE extends TopLevel[DEFLATE with Double]
  
  @js.native
  sealed trait DEFLATE64 extends CompressionMethod
  /* 9 */ @js.native
  object DEFLATE64 extends TopLevel[DEFLATE64 with Double]
  
  @js.native
  sealed trait IMPLODE extends CompressionMethod
  /* 6 */ @js.native
  object IMPLODE extends TopLevel[IMPLODE with Double]
  
  @js.native
  sealed trait LZ77 extends CompressionMethod
  /* 19 */ @js.native
  object LZ77 extends TopLevel[LZ77 with Double]
  
  @js.native
  sealed trait LZMA extends CompressionMethod
  /* 14 */ @js.native
  object LZMA extends TopLevel[LZMA with Double]
  
  @js.native
  sealed trait PPMD extends CompressionMethod
  /* 98 */ @js.native
  object PPMD extends TopLevel[PPMD with Double]
  
  @js.native
  sealed trait REDUCED_1 extends CompressionMethod
  /* 2 */ @js.native
  object REDUCED_1 extends TopLevel[REDUCED_1 with Double]
  
  @js.native
  sealed trait REDUCED_2 extends CompressionMethod
  /* 3 */ @js.native
  object REDUCED_2 extends TopLevel[REDUCED_2 with Double]
  
  @js.native
  sealed trait REDUCED_3 extends CompressionMethod
  /* 4 */ @js.native
  object REDUCED_3 extends TopLevel[REDUCED_3 with Double]
  
  @js.native
  sealed trait REDUCED_4 extends CompressionMethod
  /* 5 */ @js.native
  object REDUCED_4 extends TopLevel[REDUCED_4 with Double]
  
  @js.native
  sealed trait SHRUNK extends CompressionMethod
  /* 1 */ @js.native
  object SHRUNK extends TopLevel[SHRUNK with Double]
  
  @js.native
  sealed trait STORED extends CompressionMethod
  /* 0 */ @js.native
  object STORED extends TopLevel[STORED with Double]
  
  @js.native
  sealed trait TERSE_NEW extends CompressionMethod
  /* 18 */ @js.native
  object TERSE_NEW extends TopLevel[TERSE_NEW with Double]
  
  @js.native
  sealed trait TERSE_OLD extends CompressionMethod
  /* 10 */ @js.native
  object TERSE_OLD extends TopLevel[TERSE_OLD with Double]
  
  @js.native
  sealed trait WAVPACK extends CompressionMethod
  /* 97 */ @js.native
  object WAVPACK extends TopLevel[WAVPACK with Double]
}
