package typings.beforeAfterHook

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.beforeAfterHook.beforeAfterHookStrings.E
import typings.beforeAfterHook.beforeAfterHookStrings.Error
import typings.beforeAfterHook.beforeAfterHookStrings.O
import typings.beforeAfterHook.beforeAfterHookStrings.Options
import typings.beforeAfterHook.beforeAfterHookStrings.R
import typings.beforeAfterHook.beforeAfterHookStrings.Result
import typings.beforeAfterHook.beforeAfterHookStrings.after
import typings.beforeAfterHook.beforeAfterHookStrings.before
import typings.beforeAfterHook.beforeAfterHookStrings.error_
import typings.beforeAfterHook.beforeAfterHookStrings.remove
import typings.beforeAfterHook.beforeAfterHookStrings.wrap
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    open class CollectionCls[HooksType /* <: Record[String, TypeStore] */] ()
      extends StObject
         with HookCollection[HooksType, /* keyof HooksType */ String]
    
    /**
      * Creates a nameless hook that supports strict typings
      */
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("before-after-hook", "default.Singular")
    @js.native
    open class SingularCls[Options, Result, Error] ()
      extends StObject
         with HookSingular[Options, Result, Error]
    
    type _To = Hook
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: Hook = ^
  }
  
  @JSImport("before-after-hook", "Collection")
  @js.native
  val Collection: typings.beforeAfterHook.mod.Collection = js.native
  type Collection = Instantiable0[
    HookCollection[
      Record[String, TypeStore], 
      /* keyof std.Record<string, before-after-hook.before-after-hook.TypeStore> */ String
    ]
  ]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("before-after-hook", "Collection")
  @js.native
  open class CollectionCls[HooksType /* <: Record[String, TypeStore] */] ()
    extends StObject
       with HookCollection[HooksType, /* keyof HooksType */ String]
  
  @js.native
  trait Hook
    extends StObject
       with Instantiable0[
          HookCollection[
            Record[String, TypeStore], 
            /* keyof std.Record<string, before-after-hook.before-after-hook.TypeStore> */ String
          ]
        ] {
    
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
    open class CollectionCls[HooksType /* <: Record[String, TypeStore] */] ()
      extends StObject
         with HookCollection[HooksType, /* keyof HooksType */ String]
    
    /**
      * Creates a nameless hook that supports strict typings
      */
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("before-after-hook", "Hook.Singular")
    @js.native
    open class SingularCls[Options, Result, Error] ()
      extends StObject
         with HookSingular[Options, Result, Error]
    
    type _To = Hook
    
    /* This means you don't have to write `^`, but can instead just say `Hook.foo` */
    override def _to: Hook = ^
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("before-after-hook", "Hook")
  @js.native
  open class HookCls[HooksType /* <: Record[String, TypeStore] */] ()
    extends StObject
       with HookCollection[HooksType, /* keyof HooksType */ String]
  
  @JSImport("before-after-hook", "Singular")
  @js.native
  val Singular: typings.beforeAfterHook.mod.Singular = js.native
  type Singular = Instantiable0[HookSingular[js.Object, js.Object, js.Object]]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("before-after-hook", "Singular")
  @js.native
  open class SingularCls[Options, Result, Error] ()
    extends StObject
       with HookSingular[Options, Result, Error]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("before-after-hook", JSImport.Default)
  @js.native
  open class defaultCls[HooksType /* <: Record[String, TypeStore] */] ()
    extends StObject
       with HookCollection[HooksType, /* keyof HooksType */ String]
  
  type AfterHook[Options, Result] = js.Function2[/* result */ Result, /* options */ Options, Unit | js.Promise[Unit]]
  
  type AnyHook[Options, Result, Error] = BeforeHook[Options] | (ErrorHook[Options, Error]) | (AfterHook[Options, Result]) | (WrapHook[Options, Result])
  
  type BeforeHook[Options] = js.Function1[/* options */ Options, Unit | js.Promise[Unit]]
  
  type ErrorHook[Options, Error] = js.Function2[/* error */ Error, /* options */ Options, Unit | js.Promise[Unit]]
  
  type GetType[Store /* <: TypeStore */, LongKey /* <: TypeStoreKeyLong */, ShortKey /* <: TypeStoreKeyShort */] = /* import warning: importer.ImportType#apply Failed type conversion: Store[ShortKey] */ js.Any
  
  @js.native
  trait HookCollection[HooksType /* <: Record[String, TypeStore] */, HookName /* <: /* keyof HooksType */ String */] extends StObject {
    
    /**
      * Invoke before and after hooks
      */
    def apply[Name /* <: HookName */](
      name: Name,
      hookMethod: HookMethod[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Options, 
            O
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Result, 
            R
          ]
        ]
    ): js.Promise[
        GetType[
          /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
          Result, 
          R
        ]
      ] = js.native
    def apply[Name /* <: HookName */](
      name: Name,
      hookMethod: HookMethod[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Options, 
            O
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Result, 
            R
          ]
        ],
      options: GetType[
          /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
          Options, 
          O
        ]
    ): js.Promise[
        GetType[
          /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
          Result, 
          R
        ]
      ] = js.native
    def apply[Name /* <: HookName */](
      name: js.Array[Name],
      hookMethod: HookMethod[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Options, 
            O
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Result, 
            R
          ]
        ]
    ): js.Promise[
        GetType[
          /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
          Result, 
          R
        ]
      ] = js.native
    def apply[Name /* <: HookName */](
      name: js.Array[Name],
      hookMethod: HookMethod[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Options, 
            O
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Result, 
            R
          ]
        ],
      options: GetType[
          /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
          Options, 
          O
        ]
    ): js.Promise[
        GetType[
          /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
          Result, 
          R
        ]
      ] = js.native
    
    /**
      * Add `after` hook for given `name`
      */
    def after[Name /* <: HookName */](
      name: Name,
      afterHook: AfterHook[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Options, 
            O
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Result, 
            R
          ]
        ]
    ): Unit = js.native
    
    /**
      * Public API
      */
    var api: Pick[
        HookCollection[HooksType, /* keyof HooksType */ String], 
        before | error_ | after | wrap | remove
      ] = js.native
    
    /**
      * Add `before` hook for given `name`
      */
    def before[Name /* <: HookName */](
      name: Name,
      beforeHook: BeforeHook[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Options, 
            O
          ]
        ]
    ): Unit = js.native
    
    /**
      * Add `error` hook for given `name`
      */
    def error[Name /* <: HookName */](
      name: Name,
      errorHook: ErrorHook[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Options, 
            O
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Error, 
            E
          ]
        ]
    ): Unit = js.native
    
    /**
      * Remove added hook for given `name`
      */
    def remove[Name /* <: HookName */](
      name: Name,
      hook: AnyHook[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Options, 
            O
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Result, 
            R
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Error, 
            E
          ]
        ]
    ): Unit = js.native
    
    /**
      * Add `wrap` hook for given `name`
      */
    def wrap[Name /* <: HookName */](
      name: Name,
      wrapHook: WrapHook[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Options, 
            O
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Result, 
            R
          ]
        ]
    ): Unit = js.native
  }
  
  type HookMethod[Options, Result] = js.Function1[/* options */ Options, Result | js.Promise[Result]]
  
  @js.native
  trait HookSingular[Options, Result, Error] extends StObject {
    
    /**
      * Invoke before and after hooks
      */
    def apply(hookMethod: HookMethod[Options, Result]): js.Promise[Result] = js.native
    def apply(hookMethod: HookMethod[Options, Result], options: Options): js.Promise[Result] = js.native
    
    /**
      * Add `after` hook
      */
    def after(afterHook: AfterHook[Options, Result]): Unit = js.native
    
    /**
      * Public API
      */
    var api: Pick[HookSingular[Options, Result, Error], before | error_ | after | wrap | remove] = js.native
    
    /**
      * Add `before` hook
      */
    def before(beforeHook: BeforeHook[Options]): Unit = js.native
    
    /**
      * Add `error` hook
      */
    def error(errorHook: ErrorHook[Options, Error]): Unit = js.native
    
    /**
      * Remove added hook
      */
    def remove(hook: AnyHook[Options, Result, Error]): Unit = js.native
    
    /**
      * Add `wrap` hook
      */
    def wrap(wrapHook: WrapHook[Options, Result]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.beforeAfterHook.anon.keyinTypeStoreKeyLonganyk
    - typings.beforeAfterHook.anon.keyinTypeStoreKeyLongneve
  */
  trait TypeStore extends StObject
  object TypeStore {
    
    inline def keyinTypeStoreKeyLonganyk(): typings.beforeAfterHook.anon.keyinTypeStoreKeyLonganyk = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.beforeAfterHook.anon.keyinTypeStoreKeyLonganyk]
    }
    
    inline def keyinTypeStoreKeyLongneve(): typings.beforeAfterHook.anon.keyinTypeStoreKeyLongneve = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.beforeAfterHook.anon.keyinTypeStoreKeyLongneve]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.beforeAfterHook.beforeAfterHookStrings.Options
    - typings.beforeAfterHook.beforeAfterHookStrings.Result
    - typings.beforeAfterHook.beforeAfterHookStrings.Error
  */
  trait TypeStoreKeyLong extends StObject
  object TypeStoreKeyLong {
    
    inline def Error: typings.beforeAfterHook.beforeAfterHookStrings.Error = "Error".asInstanceOf[typings.beforeAfterHook.beforeAfterHookStrings.Error]
    
    inline def Options: typings.beforeAfterHook.beforeAfterHookStrings.Options = "Options".asInstanceOf[typings.beforeAfterHook.beforeAfterHookStrings.Options]
    
    inline def Result: typings.beforeAfterHook.beforeAfterHookStrings.Result = "Result".asInstanceOf[typings.beforeAfterHook.beforeAfterHookStrings.Result]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.beforeAfterHook.beforeAfterHookStrings.O
    - typings.beforeAfterHook.beforeAfterHookStrings.R
    - typings.beforeAfterHook.beforeAfterHookStrings.E
  */
  trait TypeStoreKeyShort extends StObject
  object TypeStoreKeyShort {
    
    inline def E: typings.beforeAfterHook.beforeAfterHookStrings.E = "E".asInstanceOf[typings.beforeAfterHook.beforeAfterHookStrings.E]
    
    inline def O: typings.beforeAfterHook.beforeAfterHookStrings.O = "O".asInstanceOf[typings.beforeAfterHook.beforeAfterHookStrings.O]
    
    inline def R: typings.beforeAfterHook.beforeAfterHookStrings.R = "R".asInstanceOf[typings.beforeAfterHook.beforeAfterHookStrings.R]
  }
  
  type WrapHook[Options, Result] = js.Function2[
    /* hookMethod */ HookMethod[Options, Result], 
    /* options */ Options, 
    Result | js.Promise[Result]
  ]
}
