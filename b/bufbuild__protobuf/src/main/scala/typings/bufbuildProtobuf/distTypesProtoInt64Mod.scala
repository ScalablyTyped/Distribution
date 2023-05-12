package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.anon.Hi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProtoInt64Mod {
  
  @JSImport("@bufbuild/protobuf/dist/types/proto-int64", "protoInt64")
  @js.native
  val protoInt64: Int64Support = js.native
  
  @js.native
  trait Int64Support extends StObject {
    
    /**
      * Convert a two's complement to a signed 64-bit integral value.
      * Returns a bigint if available, a string otherwise.
      */
    def dec(lo: Double, hi: Double): js.BigInt = js.native
    
    /**
      * Convert a signed 64-bit integral value to a two's complement.
      */
    def enc(value: String): Hi = js.native
    def enc(value: js.BigInt): Hi = js.native
    def enc(value: Double): Hi = js.native
    
    /**
      * Parse a signed 64-bit integer.
      * Returns a bigint if available, a string otherwise.
      */
    def parse(value: String): js.BigInt = js.native
    def parse(value: js.BigInt): js.BigInt = js.native
    def parse(value: Double): js.BigInt = js.native
    
    /**
      * Is bigint available?
      */
    val supported: Boolean = js.native
    
    /**
      * Convert a two's complement to an unsigned 64-bit integral value.
      * Returns a bigint if available, a string otherwise.
      */
    def uDec(lo: Double, hi: Double): js.BigInt = js.native
    
    /**
      * Convert an unsigned 64-bit integral value to a two's complement.
      */
    def uEnc(value: String): Hi = js.native
    def uEnc(value: js.BigInt): Hi = js.native
    def uEnc(value: Double): Hi = js.native
    
    /**
      * Parse an unsigned 64-bit integer.
      * Returns a bigint if available, a string otherwise.
      */
    def uParse(value: String): js.BigInt = js.native
    def uParse(value: js.BigInt): js.BigInt = js.native
    def uParse(value: Double): js.BigInt = js.native
    
    /**
      * 0n if bigint is available, "0" if unavailable.
      */
    val zero: js.BigInt = js.native
  }
}
