package typings.browserfs.distNodeBackendZipFSMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompressionMethod extends js.Object

@JSImport("browserfs/dist/node/backend/ZipFS", "CompressionMethod")
@js.native
object CompressionMethod extends js.Object {
  @js.native
  sealed trait BZIP2 extends CompressionMethod
  
  @js.native
  sealed trait DEFLATE extends CompressionMethod
  
  @js.native
  sealed trait DEFLATE64 extends CompressionMethod
  
  @js.native
  sealed trait IMPLODE extends CompressionMethod
  
  @js.native
  sealed trait LZ77 extends CompressionMethod
  
  @js.native
  sealed trait LZMA extends CompressionMethod
  
  @js.native
  sealed trait PPMD extends CompressionMethod
  
  @js.native
  sealed trait REDUCED_1 extends CompressionMethod
  
  @js.native
  sealed trait REDUCED_2 extends CompressionMethod
  
  @js.native
  sealed trait REDUCED_3 extends CompressionMethod
  
  @js.native
  sealed trait REDUCED_4 extends CompressionMethod
  
  @js.native
  sealed trait SHRUNK extends CompressionMethod
  
  @js.native
  sealed trait STORED extends CompressionMethod
  
  @js.native
  sealed trait TERSE_NEW extends CompressionMethod
  
  @js.native
  sealed trait TERSE_OLD extends CompressionMethod
  
  @js.native
  sealed trait WAVPACK extends CompressionMethod
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompressionMethod with Double] = js.native
  /* 12 */ @js.native
  object BZIP2 extends TopLevel[BZIP2 with Double]
  
  /* 8 */ @js.native
  object DEFLATE extends TopLevel[DEFLATE with Double]
  
  /* 9 */ @js.native
  object DEFLATE64 extends TopLevel[DEFLATE64 with Double]
  
  /* 6 */ @js.native
  object IMPLODE extends TopLevel[IMPLODE with Double]
  
  /* 19 */ @js.native
  object LZ77 extends TopLevel[LZ77 with Double]
  
  /* 14 */ @js.native
  object LZMA extends TopLevel[LZMA with Double]
  
  /* 98 */ @js.native
  object PPMD extends TopLevel[PPMD with Double]
  
  /* 2 */ @js.native
  object REDUCED_1 extends TopLevel[REDUCED_1 with Double]
  
  /* 3 */ @js.native
  object REDUCED_2 extends TopLevel[REDUCED_2 with Double]
  
  /* 4 */ @js.native
  object REDUCED_3 extends TopLevel[REDUCED_3 with Double]
  
  /* 5 */ @js.native
  object REDUCED_4 extends TopLevel[REDUCED_4 with Double]
  
  /* 1 */ @js.native
  object SHRUNK extends TopLevel[SHRUNK with Double]
  
  /* 0 */ @js.native
  object STORED extends TopLevel[STORED with Double]
  
  /* 18 */ @js.native
  object TERSE_NEW extends TopLevel[TERSE_NEW with Double]
  
  /* 10 */ @js.native
  object TERSE_OLD extends TopLevel[TERSE_OLD with Double]
  
  /* 97 */ @js.native
  object WAVPACK extends TopLevel[WAVPACK with Double]
  
}

