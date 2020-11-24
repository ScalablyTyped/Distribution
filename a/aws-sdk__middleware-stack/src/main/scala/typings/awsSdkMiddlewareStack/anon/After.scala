package typings.awsSdkMiddlewareStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait After extends js.Object {
  
  var after: js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.Normalized<@aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.RelativeMiddlewareEntry<Input, Output>, Input, Output> */ js.Object
  ] = js.native
  
  var before: js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.Normalized<@aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.RelativeMiddlewareEntry<Input, Output>, Input, Output> */ js.Object
  ] = js.native
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
  implicit class AfterOps[Self <: After] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfterVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.Normalized<@aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.RelativeMiddlewareEntry<Input, Output>, Input, Output> */ js.Object)*
    ): Self = this.set("after", js.Array(value :_*))
    
    @scala.inline
    def setAfter(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.Normalized<@aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.RelativeMiddlewareEntry<Input, Output>, Input, Output> */ js.Object
        ]
    ): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.Normalized<@aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.RelativeMiddlewareEntry<Input, Output>, Input, Output> */ js.Object)*
    ): Self = this.set("before", js.Array(value :_*))
    
    @scala.inline
    def setBefore(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.Normalized<@aws-sdk/middleware-stack.@aws-sdk/middleware-stack/dist/cjs/types.RelativeMiddlewareEntry<Input, Output>, Input, Output> */ js.Object
        ]
    ): Self = this.set("before", value.asInstanceOf[js.Any])
  }
}
