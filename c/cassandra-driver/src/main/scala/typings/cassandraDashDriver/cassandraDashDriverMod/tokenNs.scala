package typings.cassandraDashDriver.cassandraDashDriverMod

import typings.cassandraDashDriver.Anon_CodeInfo
import typings.cassandraDashDriver.cassandraDashDriverMod.tokenNs.Token
import typings.cassandraDashDriver.cassandraDashDriverMod.tokenNs.TokenRange
import typings.cassandraDashDriver.cassandraDashDriverMod.tokenNs.Tokenizer
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "token")
@js.native
object tokenNs extends js.Object {
  @js.native
  class Token protected () extends js.Object {
    def this(value: js.Any) = this()
    def compare(other: Token): Double = js.native
    def equals(other: Token): Boolean = js.native
    def getType(): Anon_CodeInfo = js.native
    def getValue(): js.Any = js.native
  }
  
  @js.native
  class TokenRange protected () extends js.Object {
    def this(start: Token, end: Token, tokenizer: Tokenizer) = this()
    var end: Token = js.native
    var start: Token = js.native
    def compare(other: TokenRange): Double = js.native
    def contains(token: Token): Boolean = js.native
    def equals(other: TokenRange): Boolean = js.native
    def isEmpty(): Boolean = js.native
    def isWrappedAround(): Boolean = js.native
    def splitEvenly(numberOfSplits: Double): js.Array[TokenRange] = js.native
    def unwrap(): js.Array[TokenRange] = js.native
  }
  
  @js.native
  trait Tokenizer extends js.Object {
    def hash(value: js.Array[Double]): Token = js.native
    def hash(value: Buffer): Token = js.native
    def minToken(): Token = js.native
    def parse(value: String): Token = js.native
    def split(start: Token, end: Token, numberOfSplits: Double): js.Array[TokenRange] = js.native
    def splitBase(start: Double, end: Double, ringEnd: Double, ringLength: Double, numberOfSplits: Double): js.Array[Double] = js.native
    def stringify(token: Token): String = js.native
  }
  
}

