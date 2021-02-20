package typings.beforeAfterHook

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    @JSImport("before-after-hook", JSImport.Default)
    @js.native
    val ^ : Hook = js.native
    
    /**
      * Creates a collection of hooks
      */
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("before-after-hook", "default.Collection")
    @js.native
    class CollectionCls () extends HookCollection
    
    /**
      * Creates a nameless hook that supports strict typings
      */
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("before-after-hook", "default.Singular")
    @js.native
    class SingularCls[O, R, E] () extends HookSingular[O, R, E]
    
    type _To = Hook
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: Hook = ^
  }
  
  @JSImport("before-after-hook", "Collection")
  @js.native
  val Collection: typings.beforeAfterHook.mod.Collection = js.native
  type Collection = Instantiable0[HookCollection]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("before-after-hook", "Collection")
  @js.native
  class CollectionCls () extends HookCollection
  
  @js.native
  trait Hook extends Instantiable0[HookCollection] {
    
    /**
      * Creates a collection of hooks
      */
    var Collection: typings.beforeAfterHook.mod.Collection = js.native
    
    /**
      * Creates a nameless hook that supports strict typings
      */
    var Singular: typings.beforeAfterHook.mod.Singular = js.native
  }
  object Hook extends Shortcut {
    
    @JSImport("before-after-hook", "Hook")
    @js.native
    val ^ : Hook = js.native
    
    /**
      * Creates a collection of hooks
      */
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("before-after-hook", "Hook.Collection")
    @js.native
    class CollectionCls () extends HookCollection
    
    /**
      * Creates a nameless hook that supports strict typings
      */
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("before-after-hook", "Hook.Singular")
    @js.native
    class SingularCls[O, R, E] () extends HookSingular[O, R, E]
    
    type _To = Hook
    
    /* This means you don't have to write `^`, but can instead just say `Hook.foo` */
    override def _to: Hook = ^
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("before-after-hook", "Hook")
  @js.native
  class HookCls () extends HookCollection
  
  @JSImport("before-after-hook", "Singular")
  @js.native
  val Singular: typings.beforeAfterHook.mod.Singular = js.native
  type Singular = Instantiable0[HookSingular[js.Object, js.Object, js.Object]]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("before-after-hook", "Singular")
  @js.native
  class SingularCls[O, R, E] () extends HookSingular[O, R, E]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("before-after-hook", JSImport.Default)
  @js.native
  class defaultCls () extends HookCollection
  
  type AfterHook[O, R] = js.Function2[/* result */ R, /* options */ O, Unit]
  
  type AnyHook[O, R, E] = BeforeHook[O] | (ErrorHook[O, E]) | (AfterHook[O, R]) | (WrapHook[O, R])
  
  type BeforeHook[O] = js.Function1[/* options */ O, Unit]
  
  type ErrorHook[O, E] = js.Function2[/* error */ E, /* options */ O, Unit]
  
  @js.native
  trait HookCollection extends StObject {
    
    /**
      * Invoke before and after hooks
      */
    def apply(name: String, hookMethod: HookMethod[_, _]): js.Promise[_] = js.native
    def apply(name: String, hookMethod: HookMethod[_, _], options: js.Any): js.Promise[_] = js.native
    def apply(name: js.Array[String], hookMethod: HookMethod[_, _]): js.Promise[_] = js.native
    def apply(name: js.Array[String], hookMethod: HookMethod[_, _], options: js.Any): js.Promise[_] = js.native
    
    /**
      * Add `after` hook for given `name`
      */
    def after(name: String, afterHook: AfterHook[_, _]): Unit = js.native
    
    /**
      * Add `before` hook for given `name`
      */
    def before(name: String, beforeHook: BeforeHook[_]): Unit = js.native
    
    /**
      * Add `error` hook for given `name`
      */
    def error(name: String, errorHook: ErrorHook[_, _]): Unit = js.native
    
    /**
      * Remove added hook for given `name`
      */
    def remove(name: String, hook: AnyHook[_, _, _]): Unit = js.native
    
    /**
      * Add `wrap` hook for given `name`
      */
    def wrap(name: String, wrapHook: WrapHook[_, _]): Unit = js.native
  }
  
  type HookMethod[O, R] = js.Function1[/* options */ O, R | js.Promise[R]]
  
  @js.native
  trait HookSingular[O, R, E] extends StObject {
    
    /**
      * Invoke before and after hooks
      */
    def apply(hookMethod: HookMethod[O, R]): js.Promise[R] = js.native
    def apply(hookMethod: HookMethod[O, R], options: O): js.Promise[R] = js.native
    
    /**
      * Add `after` hook
      */
    def after(afterHook: AfterHook[O, R]): Unit = js.native
    
    /**
      * Add `before` hook
      */
    def before(beforeHook: BeforeHook[O]): Unit = js.native
    
    /**
      * Add `error` hook
      */
    def error(errorHook: ErrorHook[O, E]): Unit = js.native
    
    /**
      * Remove added hook
      */
    def remove(hook: AnyHook[O, R, E]): Unit = js.native
    
    /**
      * Add `wrap` hook
      */
    def wrap(wrapHook: WrapHook[O, R]): Unit = js.native
  }
  
  type WrapHook[O, R] = js.Function2[/* hookMethod */ HookMethod[O, R], /* options */ O, R | js.Promise[R]]
}
