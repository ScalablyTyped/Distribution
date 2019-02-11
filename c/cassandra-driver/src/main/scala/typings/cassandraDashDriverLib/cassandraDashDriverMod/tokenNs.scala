package typings
package cassandraDashDriverLib.cassandraDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "token")
@js.native
object tokenNs extends js.Object {
  @js.native
  class Token protected () extends js.Object {
    def this(value: js.Any) = this()
    def compare(other: Token): scala.Double = js.native
    def equals(other: Token): scala.Boolean = js.native
    def getType(): cassandraDashDriverLib.Anon_CodeInfo = js.native
    def getValue(): js.Any = js.native
  }
  
  @js.native
  class TokenRange protected () extends js.Object {
    def this(start: Token, end: Token, tokenizer: Tokenizer) = this()
    var end: Token = js.native
    var start: Token = js.native
    def compare(other: TokenRange): scala.Double = js.native
    def contains(token: Token): scala.Boolean = js.native
    def equals(other: TokenRange): scala.Boolean = js.native
    def isEmpty(): scala.Boolean = js.native
    def isWrappedAround(): scala.Boolean = js.native
    def splitEvenly(numberOfSplits: scala.Double): js.Array[TokenRange] = js.native
    def unwrap(): js.Array[TokenRange] = js.native
  }
  
  @js.native
  trait Tokenizer extends js.Object {
    def hash(value: js.Array[scala.Double]): Token = js.native
    def hash(value: nodeLib.Buffer): Token = js.native
    def minToken(): Token = js.native
    def parse(value: java.lang.String): Token = js.native
    def split(start: Token, end: Token, numberOfSplits: scala.Double): js.Array[TokenRange] = js.native
    def splitBase(
      start: scala.Double,
      end: scala.Double,
      ringEnd: scala.Double,
      ringLength: scala.Double,
      numberOfSplits: scala.Double
    ): js.Array[scala.Double] = js.native
    def stringify(token: Token): java.lang.String = js.native
  }
  
}

