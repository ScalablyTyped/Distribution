package typings.awsSdkMiddlewareStack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait After extends StObject {
    
    var after: js.Array[
        /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.Normalized<@aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.RelativeMiddlewareEntry<Input, Output>, Input, Output> */ js.Object
      ]
    
    var before: js.Array[
        /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.Normalized<@aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.RelativeMiddlewareEntry<Input, Output>, Input, Output> */ js.Object
      ]
  }
  object After {
    
    @scala.inline
    def apply(
      after: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.Normalized<@aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.RelativeMiddlewareEntry<Input, Output>, Input, Output> */ js.Object
        ],
      before: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.Normalized<@aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.RelativeMiddlewareEntry<Input, Output>, Input, Output> */ js.Object
        ]
    ): After = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[After]
    }
    
    @scala.inline
    implicit class AfterMutableBuilder[Self <: After] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(
        value: js.Array[
              /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.Normalized<@aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.RelativeMiddlewareEntry<Input, Output>, Input, Output> */ js.Object
            ]
      ): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterVarargs(
        value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.Normalized<@aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.RelativeMiddlewareEntry<Input, Output>, Input, Output> */ js.Object)*
      ): Self = StObject.set(x, "after", js.Array(value :_*))
      
      @scala.inline
      def setBefore(
        value: js.Array[
              /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.Normalized<@aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.RelativeMiddlewareEntry<Input, Output>, Input, Output> */ js.Object
            ]
      ): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeVarargs(
        value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.Normalized<@aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.RelativeMiddlewareEntry<Input, Output>, Input, Output> */ js.Object)*
      ): Self = StObject.set(x, "before", js.Array(value :_*))
    }
  }
}
