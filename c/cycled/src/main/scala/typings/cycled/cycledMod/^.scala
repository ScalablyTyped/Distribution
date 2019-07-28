package typings.cycled.cycledMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cycled", JSImport.Namespace)
@js.native
class ^[T] protected () extends Cycled[T] {
  /**
  	Initiates an array subclass with the methods documented below.
  	Since it's an array, you can use all the normal array methods on it.
  	The instance is an iterable that will cycle through the array.
  	It will cycle through the number of elements equaling the length of the array from the current index.
  	@example
  	```
  	import Cycled = require('cycled');
  	const numberCycle = new Cycled([1,2,3,4,5]);
  	console.log(...numberCycle);
  	//=> 1 2 3 4 5
  	class TabComponent {
  		constructor(views) {
  			this.activeView = views[0];
  			this.views = new Cycled(views);
  		}
  		setActiveView(view) {
  			this.activeView = view;
  			this.views.index = this.views.indexOf(view);
  		}
  		nextView() {
  			setActiveView(this.views.next());
  		}
  		previousView() {
  			setActiveView(this.views.previous());
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
  def this(array: js.Array[T]) = this()
}

