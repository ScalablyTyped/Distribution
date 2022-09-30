package typings.bardjs

import typings.chai.Chai.AssertionError
import typings.mocha.Mocha.Context
import typings.mocha.Mocha.Runner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Module for bardjs functions
    */
  object bard {
    
    @JSGlobal("bard")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Add names of globals to list of OK globals for this mocha spec
      * NB: Call this method ONLY if you're using mocha!
      * NB: Turn off browser-sync else mocha detects the browser-sync globals
      * like ` ___browserSync___`
      */
    inline def addGlobals(globals: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addGlobals")(globals.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /**
      * Prepare ngMocked application feature module
      * along with faked toastr, routehelper,
      * and faked router services.
      * Especially useful for controller testing
      * Use it as you would the ngMocks#module method
      *
      * DO NOT USE IF YOU NEED THE REAL ROUTER SERVICES!
      * Fall back to `angular.mock.module(...)` or just `module(...)`
      */
    inline def appModule(fns: (String | js.Function | js.Object)*): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("appModule")(fns.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function0[Unit]]
    
    /**
      * Assert a failure in mocha, without condition
      */
    inline def assertFail(message: String): AssertionError = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFail")(message.asInstanceOf[js.Any]).asInstanceOf[AssertionError]
    
    /**
      * Prepare ngMocked module definition that makes real $http and $q calls
      * Also adds fakeLogger to the end of the definition
      * Use it as you would the ngMocks#module method
      */
    inline def asyncModule(fns: (String | js.Function | js.Object)*): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncModule")(fns.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function0[Unit]]
    
    /**
      * Get or set bard debugging flag
      */
    inline def debugging(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("debugging")().asInstanceOf[Boolean]
    inline def debugging(newFlag: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("debugging")(newFlag.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Registers a fake logger service that you can spy on
      */
    inline def fakeLogger(
      $provide: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.auto.IProvideService */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fakeLogger")($provide.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Registers a fake route helper provider service that you can spy on
      */
    inline def fakeRouteHelperProvider(
      $provide: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.auto.IProvideService */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fakeRouteHelperProvider")($provide.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Stub out the $routeProvider so we avoid
      * all routing calls, including the default route
      * which runs on every test otherwise.
      * Make sure this goes before the inject in the spec.
      */
    inline def fakeRouteProvider(
      $provide: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.auto.IProvideService */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fakeRouteProvider")($provide.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Stub out the $stateProvider so we avoid
      * all routing calls, including the default state
      * which runs on every test otherwise.
      * Make sure this goes before the inject in the spec.
      */
    inline def fakeStateProvider(
      $provide: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.auto.IProvideService */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fakeStateProvider")($provide.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Registers a fake toastr service that you can spy on
      */
    inline def fakeToastr(
      $provide: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.auto.IProvideService */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fakeToastr")($provide.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *  Replaces the ngMock'ed $httpBackend with the real one from ng thus
      *  restoring the ability to issue AJAX calls to the backend with $http.
      *
      *  Note that $q remains ngMocked so you must flush $http calls ($rootScope.$digest).
      *  Use $rootScope.$apply() for this purpose.
      *
      *  Could restore $q with $qReal in which case don't need to flush.
      */
    inline def httpBackend(
      $provide: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.auto.IProvideService */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("$httpBackend")($provide.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /**
      * Inject selected services into the windows object during test
      * then remove them when test ends with an `afterEach`.
      *
      * spares us the repetition of creating common service vars and injecting them
      *
      * Option: the first argument may be the mocha spec context object (`this`)
      *         It MUST be `this` if you what to check for mocha global leaks.
      *         Do NOT supply `this` as the first arg if you're not running mocha specs.
      *
      * remaining inject arguments may take one of 3 forms :
      *
      *    function    - This fn will be passed to ngMocks.inject.
      *                  Annotations extracted after inject does its thing.
      *    [strings]   - same string array you'd use to set fn.$inject
      *    (...string) - string arguments turned into a string array
      */
    inline def inject(context: js.Function, args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(scala.List(context.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def inject(context: Unit, args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(scala.List(context.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def inject(context: Context, args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(scala.List(context.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    /**
      * Write to console if bard debugging flag is on
      */
    inline def log(message: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *  Listen to mocha test runner events
      *  Usage in browser:
      *     var runner = mocha.run();
      *     bard.mochaRunnerListener(runner);
      */
    inline def mochaRunnerListener(runner: Runner): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mochaRunnerListener")(runner.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Mocks out a service with sinon stubbed functions
      * that return the values specified in the config
      *
      * If the config value is `undefined`,
      * stub the service method with a dummy that doesn't return a value
      *
      * If the config value is a function, set service property with it
      *
      * If a service member is a property, not a function,
      * set it with the config value
      * If a service member name is not a key in config,
      * follow the same logic as above to set its members
      * using the config._default value (which is `undefined` if omitted)
      *
      * If there is a config entry that is NOT a member of the service
      * add mocked function to the service using the config value
      */
    inline def mockService(service: Any, config: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mockService")(service.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      *  Replaces the ngMock'ed $q with the real one from ng thus
      *  obviating the need to flush $http and $q queues
      *  at the expense of ability to control $q timing.
      */
    inline def q(
      $provide: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.auto.IProvideService */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("$q")($provide.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /**
      * Replaces the accented characters of many European languages w/ unaccented chars
      * Use it in JavaScript string sorts where such characters may be encountered
      * Matches the default string comparers of most databases.
      * Ex: replaceAccentChars(a.Name) < replaceAccentChars(b.Name)
      * instead of:            a.Name  <                    b.Name
      */
    inline def replaceAccentChars(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceAccentChars")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      *  Assert that there are no outstanding HTTP requests after test is complete
      *  For use with ngMocks; doesn't work for async server integration tests
      */
    inline def verifyNoOutstandingHttpRequests(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyNoOutstandingHttpRequests")().asInstanceOf[Unit]
    
    /**
      * Returns a function that execute a callback function
      * (typically a fn making asserts) within a try/catch
      * The try/catch then calls the ambient "done" function
      * in the appropriate way for both success and failure
      */
    inline def wrapWithDone(callback: js.Function, done: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapWithDone")(callback.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  }
}
