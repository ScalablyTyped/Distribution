package typings.awsSdkSmithyClient

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lazyJsonMod {
  
  @JSImport("@aws-sdk/smithy-client/dist/cjs/lazy-json", "LazyJsonString")
  @js.native
  class LazyJsonString ()
    extends StObject
       with typings.awsSdkSmithyClient.lazyJsonMod.StringWrapper {
    
    def deserializeJSON(): js.Any = js.native
    
    def toJSON(): String = js.native
  }
  /* static members */
  object LazyJsonString {
    
    @JSImport("@aws-sdk/smithy-client/dist/cjs/lazy-json", "LazyJsonString")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromObject(`object`: js.Any): LazyJsonString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[LazyJsonString]
  }
  
  @js.native
  trait StringWrapper
    extends StObject
       with Instantiable1[/* arg */ js.Any, String]
  @JSImport("@aws-sdk/smithy-client/dist/cjs/lazy-json", "StringWrapper")
  @js.native
  val StringWrapper: typings.awsSdkSmithyClient.lazyJsonMod.StringWrapper = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@aws-sdk/smithy-client/dist/cjs/lazy-json", "StringWrapper")
  @js.native
  class StringWrapperCls protected ()
    extends StObject
       with typings.std.String {
    def this(arg: js.Any) = this()
  }
}
