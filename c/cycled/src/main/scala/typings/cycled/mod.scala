package typings.cycled

import typings.std.Array
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cycled", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with Cycled[T] {
    /**
    	Initiates an array subclass with the methods documented below.
    	Since it's an array, you can use all the normal array methods on it.
    	The instance is an iterable that will cycle through the array.
    	It will cycle through the number of elements equaling the length of the array from the current index.
    	@example
    	```
    	import Cycled from 'cycled';
    	const numberCycle = new Cycled([1, 2, 3, 4, 5]);
    	console.log(...numberCycle);
    	//=> 1 2 3 4 5
    	class TabComponent {
    		#activeView;
    		#views;
    		constructor(views) {
    			this.#activeView = views[0];
    			this.#views = new Cycled(views);
    		}
    		setActiveView(view) {
    			this.#activeView = view;
    			this.#views.index = this.#views.indexOf(view);
    		}
    		nextView() {
    			setActiveView(this.#views.next());
    		}
    		previousView() {
    			setActiveView(this.#views.previous());
    		}
    	}
    	const tabs = new TabComponent([
    		'Homepage',
    		'Blog',
    		'Projects',
    		'Contact'
    	]);
    	// …
    	nextButton.addEventListener('click', () => {
    		tabs.nextView();
    	});
    	```
    	*/
    def this(elements: js.Array[T]) = this()
  }
  
  @js.native
  trait Cycled[T]
    extends StObject
       with Array[T] {
    
    /**
    	Returns the current item.
    	*/
    def current(): T = js.native
    
    /**
    	Returns an iterable that will cycle through the array indefinitely.
    	*/
    def indefinitely(): IterableIterator[T] = js.native
    
    /**
    	Returns an iterable that will cycle through the array backward indefinitely.
    	*/
    def indefinitelyReversed(): IterableIterator[T] = js.native
    
    /**
    	Get or set the current index.
    	*/
    var index: Double = js.native
    
    /**
    	Returns the next item.
    	*/
    def next(): T = js.native
    
    /**
    	Returns the item that is located in the given amount of `steps` through the array. For example, calling `peek(2)` would get the item 2 items after the current one.
    	You go backward by specifying a negative number.
    	This method is similar to `.step()` but without changing the current item.
    	*/
    def peek(steps: Double): T = js.native
    
    /**
    	Returns the previous item.
    	*/
    def previous(): T = js.native
    
    /**
    	Returns the item by going the given amount of `steps` through the array. For example, calling `step(2)` is like calling `next()` twice.
    	You go backward by specifying a negative number.
    	*/
    def step(steps: Double): T = js.native
  }
}
