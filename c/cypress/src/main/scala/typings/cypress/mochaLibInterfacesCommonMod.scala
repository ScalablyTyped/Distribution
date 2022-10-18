package typings.cypress

import typings.cypress.Mocha.AsyncFunc
import typings.cypress.Mocha.Func
import typings.cypress.Mocha.MochaGlobals
import typings.cypress.Mocha.Suite
import typings.cypress.Mocha.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mochaLibInterfacesCommonMod {
  
  inline def apply(suites: js.Array[Suite], context: MochaGlobals, mocha: Mocha): CommonFunctions = (^.asInstanceOf[js.Dynamic].apply(suites.asInstanceOf[js.Any], context.asInstanceOf[js.Any], mocha.asInstanceOf[js.Any])).asInstanceOf[CommonFunctions]
  
  @JSImport("mocha/lib/interfaces/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait CommonFunctions extends StObject {
    
    /**
      * Execute after running tests.
      */
    def after(): Unit = js.native
    def after(fn: AsyncFunc): Unit = js.native
    def after(fn: Func): Unit = js.native
    /**
      * Execute after running tests.
      */
    def after(name: String): Unit = js.native
    def after(name: String, fn: AsyncFunc): Unit = js.native
    def after(name: String, fn: Func): Unit = js.native
    
    /**
      * Execute after each test case.
      */
    def afterEach(): Unit = js.native
    def afterEach(fn: AsyncFunc): Unit = js.native
    def afterEach(fn: Func): Unit = js.native
    /**
      * Execute after each test case.
      */
    def afterEach(name: String): Unit = js.native
    def afterEach(name: String, fn: AsyncFunc): Unit = js.native
    def afterEach(name: String, fn: Func): Unit = js.native
    
    /**
      * Execute before running tests.
      */
    def before(): Unit = js.native
    def before(fn: AsyncFunc): Unit = js.native
    def before(fn: Func): Unit = js.native
    /**
      * Execute before running tests.
      */
    def before(name: String): Unit = js.native
    def before(name: String, fn: AsyncFunc): Unit = js.native
    def before(name: String, fn: Func): Unit = js.native
    
    /**
      * Execute before each test case.
      */
    def beforeEach(): Unit = js.native
    def beforeEach(fn: AsyncFunc): Unit = js.native
    def beforeEach(fn: Func): Unit = js.native
    /**
      * Execute before each test case.
      */
    def beforeEach(name: String): Unit = js.native
    def beforeEach(name: String, fn: AsyncFunc): Unit = js.native
    def beforeEach(name: String, fn: Func): Unit = js.native
    
    /**
      * This is only present if flag --delay is passed into Mocha. It triggers
      * root suite execution.
      */
    def runWithSuite(suite: Suite): js.Function0[Unit] = js.native
    
    var suite: SuiteFunctions = js.native
    
    var test: TestFunctions = js.native
  }
  
  trait CreateOptions extends StObject {
    
    /** Filepath where this Suite resides */
    var file: js.UndefOr[String] = js.undefined
    
    /** Suite function */
    var fn: js.UndefOr[js.ThisFunction0[/* this */ Suite, Unit]] = js.undefined
    
    /** Is suite exclusive? */
    var isOnly: js.UndefOr[Boolean] = js.undefined
    
    /** Is suite pending? */
    var pending: js.UndefOr[Boolean] = js.undefined
    
    /** Title of suite */
    var title: String
  }
  object CreateOptions {
    
    inline def apply(title: String): CreateOptions = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateOptions]
    }
    
    extension [Self <: CreateOptions](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setFn(value: js.ThisFunction0[/* this */ Suite, Unit]): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setIsOnly(value: Boolean): Self = StObject.set(x, "isOnly", value.asInstanceOf[js.Any])
      
      inline def setIsOnlyUndefined: Self = StObject.set(x, "isOnly", js.undefined)
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait SuiteFunctions extends StObject {
    
    /**
      * Creates a suite.
      */
    def create(opts: CreateOptions): Suite
    
    /**
      * Create an exclusive Suite; convenience function
      */
    def only(opts: CreateOptions): Suite
    
    /**
      * Create a Suite, but skip it; convenience function
      */
    def skip(opts: CreateOptions): Suite
  }
  object SuiteFunctions {
    
    inline def apply(create: CreateOptions => Suite, only: CreateOptions => Suite, skip: CreateOptions => Suite): SuiteFunctions = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), only = js.Any.fromFunction1(only), skip = js.Any.fromFunction1(skip))
      __obj.asInstanceOf[SuiteFunctions]
    }
    
    extension [Self <: SuiteFunctions](x: Self) {
      
      inline def setCreate(value: CreateOptions => Suite): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setOnly(value: CreateOptions => Suite): Self = StObject.set(x, "only", js.Any.fromFunction1(value))
      
      inline def setSkip(value: CreateOptions => Suite): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
    }
  }
  
  trait TestFunctions extends StObject {
    
    /**
      * Exclusive test-case.
      */
    def only(mocha: Mocha, test: Test): Test
    
    /**
      * Number of retry attempts
      */
    def retries(n: Double): Unit
    
    /**
      * Pending test case.
      */
    def skip(title: String): Unit
  }
  object TestFunctions {
    
    inline def apply(only: (Mocha, Test) => Test, retries: Double => Unit, skip: String => Unit): TestFunctions = {
      val __obj = js.Dynamic.literal(only = js.Any.fromFunction2(only), retries = js.Any.fromFunction1(retries), skip = js.Any.fromFunction1(skip))
      __obj.asInstanceOf[TestFunctions]
    }
    
    extension [Self <: TestFunctions](x: Self) {
      
      inline def setOnly(value: (Mocha, Test) => Test): Self = StObject.set(x, "only", js.Any.fromFunction2(value))
      
      inline def setRetries(value: Double => Unit): Self = StObject.set(x, "retries", js.Any.fromFunction1(value))
      
      inline def setSkip(value: String => Unit): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
    }
  }
}
