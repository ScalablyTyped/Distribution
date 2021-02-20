package typings.checkSum

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("check-sum", JSImport.Namespace)
  @js.native
  def apply(
    path: String,
    hashes: Hashes,
    callback: js.Function1[/* error */ js.UndefOr[ChecksumError | Error], Unit]
  ): js.Function1[/* fn */ js.Function0[Unit], Unit] = js.native
  @JSImport("check-sum", JSImport.Namespace)
  @js.native
  def apply(stream: Readable, hashes: Hashes, callback: js.Function1[/* error */ ChecksumError | js.Any, Unit]): js.Function1[/* fn */ js.Function0[Unit], Unit] = js.native
  
  @js.native
  trait ChecksumError extends StObject {
    
    var actual: String = js.native
    
    var algorithm: String = js.native
    
    var expected: String = js.native
  }
  object ChecksumError {
    
    @scala.inline
    def apply(actual: String, algorithm: String, expected: String): ChecksumError = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], algorithm = algorithm.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChecksumError]
    }
    
    @scala.inline
    implicit class ChecksumErrorMutableBuilder[Self <: ChecksumError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActual(value: String): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpected(value: String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    }
  }
  
  type Hashes = StringDictionary[String | Buffer]
}
