package typings.checkSum

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    path: String,
    hashes: Hashes,
    callback: js.Function1[/* error */ js.UndefOr[ChecksumError | js.Error], Unit]
  ): js.Function1[/* fn */ js.Function0[Unit], Unit] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], hashes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fn */ js.Function0[Unit], Unit]]
  inline def apply(stream: Readable, hashes: Hashes, callback: js.Function1[/* error */ ChecksumError | Any, Unit]): js.Function1[/* fn */ js.Function0[Unit], Unit] = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], hashes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fn */ js.Function0[Unit], Unit]]
  
  @JSImport("check-sum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ChecksumError extends StObject {
    
    var actual: String
    
    var algorithm: String
    
    var expected: String
  }
  object ChecksumError {
    
    inline def apply(actual: String, algorithm: String, expected: String): ChecksumError = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], algorithm = algorithm.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChecksumError]
    }
    
    extension [Self <: ChecksumError](x: Self) {
      
      inline def setActual(value: String): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setExpected(value: String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    }
  }
  
  type Hashes = StringDictionary[String | Buffer]
}
